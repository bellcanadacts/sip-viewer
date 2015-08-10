# Overview #
Dealing with a heap of [SIP](http://en.wikipedia.org/wiki/Session_Initiation_Protocol) logs to pin point a certain call might sometimes be a difficult journey. Interesting tools such as [sipworkbench](http://www.sipworkbench.com/) or [sipx viewer](http://sipx-wiki.calivia.com/index.php/Display_SIP_message_flow_using_Sipviewer) already expose some functionalities to extract and analyse call logs.

However, our requirements were a bit different. We needed a tool able to parse text formatted sip logs on a platform with dozen of `*`NIX servers. The SIP applications are themself responsible to output formatted logs; we did not want to run infinite tcpdump for each application port on each server. Moreover, we opted toward a command line tool that can operate directly on the servers without windowing requirements. Sip Viewer aims to output the extracted call flows as simple ASCII ladders directly in the command prompt (or using an eclipse plugin).

Finally, an important feature was to control the parser to not only aggregate according the the call-id header, but to extend our application logic in order to correlate many dialogs linked by a [Back to Back User agent](http://en.wikipedia.org/wiki/Back-to-back_user_agent).

## Features ##
  * Parsing
    * Parse sip logs and aggregate sessions
      * Able to match many dialogs in the context of a back to back user agent
      * Configurable parser to suit specific log formats.
        * 2 parsers available by default:
          * plain text (default) : [see format example](http://code.google.com/p/sip-viewer/source/browse/trunk/cli/examples/b2b-example.txt).
            * For jainsip users, you can override the stack implementation with [this class](http://code.google.com/p/sip-viewer/source/browse/trunk/cli/log-adapter/JainSipCallLoggerAdapter.java) to enable plain text logs.
            * if using the to/from tags token matching strategy to correlate dialogs in the context of a back to back user agent, the regex used to distinguish the token is configurable (`--parser-b2b-token-regex`)
          * xml ([jain-sip](http://jsip.java.net/) default): [see format example](http://code.google.com/p/sip-viewer/source/browse/trunk/cli/examples/b2b-example.xml).
            * use with : ` -p javax.sip.viewer.parser.XmlLogParser `
    * more than 1 file can be provided on command line (useful when logger does rolling)
    * also able to parse gzip files (by example, our environment archives the files each night).
    * note: if you parse big files you might need to extend memory using -Xmx java parameter.
  * Filters
    * you can filter by call ID, B2B sip tag token, caller name, caller phone number and destination phone number.
    * you can use the error only filter to only expose the messages containing an error response code.
  * Call Flow
    * Organize the sip messages into an ASCII ladder.
    * All related traces are linked under the ASCII ladder
    * Name resolution (Reverse DNS) of the actor's ip to title the ASCII ladder (configurable, false by default)
    * each arrow is prefixed with a flag to distinguish the call leg (according to call-id).

# Display Example #
[see example](http://code.google.com/p/sip-viewer/wiki/OutputExample)

![http://sip-viewer.googlecode.com/svn/images/sip-viewer-ex-small.png](http://sip-viewer.googlecode.com/svn/images/sip-viewer-ex-small.png)

# Usage #
## Command Line Interface ##
### Examples ###
a [jar-with-dependencies](http://code.google.com/p/sip-viewer/downloads/list) has been packaged to simplify usage.

you can simply output your logs by doing:
```
java -jar sip-viewer-X.Y.Z-jar-with-dependencies.jar calls-2010-12-22.log
```

the library can also be accessed using [maven repository](http://sip-viewer.googlecode.com/svn/trunk/cli/mavenrepo)

### Help ###
if you simply run the application without parameter, you will get some help:
```
You must specify a log file.
Usage: SipTextViewer [options]
 
  Options:   
    -b2b, -b2bSipTagToken             find by B2B sip tag token
    -ci, -callId                      find by call ID
    -cn, -callerName                  find by caller name
    -cpn, -callerPhoneNumber          find by caller phone number
    -dpn, -destPhoneNumber            find by destination phone number
    -eo, --errorOnly                  display only the sessions with error in the response code (default: false)
    -h, --help                        Displays this help context (default: false)
    -hsl, --hideSipLog                Hides the call stack after the sequence diagram (default: false)
    -p, --parser                      Class to be used to parse the given log files (default is javax.sip.viewer.parser.TextLogParser)
    -pb2bt, --parser-b2b-token-regex  if using the default textParser which can correlate many dialogs in a same session based on a token found in "from" and "to" tags, this key overrides the regex to match that token (default : s(\d*)-.*)
    -t  --time                        Filters the logs by showing only the calls between(inclusive) the beginning time and end time (ex: -t 2012/06/13#09:44:27.264|2012/06/13#09:46:27.264)
    -s, --index                       shortcut to find by call ID or B2B sip tag token
    -rin, --reverse-ip-name           Make a reverse dns query to resolve a pretty name associated with the ip. If reverse dns misses the query, it might delay parsing (default: false)
    -v, --verbose                     Verbose diagram mode (default false)
```

## Eclipse plugin ##

A simple eclipse plugin (eclipse version > 3.6) has been developed to interact more easily with sip-viewer.

[![](http://sip-viewer.googlecode.com/svn/images/sip-viewer-plugin-small.png)](http://code.google.com/p/sip-viewer/wiki/EclipsePlugin?ts=1298053306&updated=EclipsePlugin)

You can install it in eclipse using the [update site](https://sip-viewer.googlecode.com/svn/trunk/eclipse/update-site/).

Not all the Command Line Interface options are exposed with the plugin. In order to make it as versatile as possible for the moment, it honors both [jain sip xml](http://code.google.com/p/sip-viewer/source/browse/trunk/cli/examples/b2b-example.xml) log format and the [text format](http://code.google.com/p/sip-viewer/source/browse/trunk/cli/examples/b2b-example.txt) presented above.

# Release Notes #
### 1.8.4 ###
  * When a trace includes an invite dialog and a subscribe dialog, if the event id of the subscribe dialog matches the from tag of the invite dialog the traces will be correlated
### 1.8.3 ###
  * new filtering using time span
### 1.8.2 ###
  * Minor fixes on trace pruning when indexing uac/uas logs
### 1.8.1 ###
  * Minor fix related to trace ordering when using xml parser
### 1.8.0 ###
  * Prune duplicate logs. Useful when merging files from endpoints on a same scenario. (otherwise, sip-viewing call logs from both uac and uas would show twice each common messages.)
  * couple of bug fixes regarding message ordering and message delay calculation.
  * eclipse plugin anchors with sipviewer's CLI version
  * eclipse plugin can now handle multiple selection on files.
### 1.7.0 ###
  * New faster Log Parser based on a state machine instead of regex
### 1.6.0 ###
  * filters for caller name, caller phone number, destination phone number and error only have been added.
### 1.5.1 ###
  * some api rework to expose the SipTextViewer to the eclipse plugin.
  * refactor of svn.
### 1.5.0 ###
  * an identification flag now prefixes the arrows in the ladder to distinguish the call legs. (ex. : `(a)----INVITE------>` ).
  * small bug fix in the ordering of the messages.
### 1.4.0 ###
  * a column with timestamp has been added in the tree ladder.
### 1.3.0 ###
  * Fixed a bug affecting b2b sessions missing the initial messages. Now merges call id with b2b token session.
  * Separated trace session logic from the parser classes.