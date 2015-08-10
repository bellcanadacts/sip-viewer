#Example of the callflow for a Back2Back user agent

# Output example #

1 sessions displayed

```
***** #1460 Mon, 22 Nov 2010 08:30:18 188************************************************************
#   Time (ms)   CS2K_Belmont:5060          SIPCOE01.ON.BELL.CA:12716      BASCOE01.ON.BELL.CA:12276      VIPCOE03.ON.BELL.CA:5066       UVXCOE21.ON.BELL.CA:5062       VIPCOE03.ON.BELL.CA:12786
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1   0                 |                              |------INVITE 5143901033------>|                              |                              |                              |
2   1                 |                              |<---------100 Trying----------|                              |                              |                              |
3   6                 |                              |                              |------INVITE 5143901033------>|                              |                              |
4   9                 |                              |                              |<---------100 Trying----------|                              |                              |
5   9                 |                              |                              |<--------180 Ringing----------|                              |                              |
6   10                |                              |<--------180 Ringing----------|                              |                              |                              |
7   59                |                              |                              |<-----------200 Ok------------|                              |                              |
8   60                |                              |<-----------200 OK------------|                              |                              |                              |
9   69                |-----------------------------ACK---------------------------->|                              |                              |                              |
10  70                |                              |                              |---------------------------ACK nvp-------------------------->|                              |
11  66668             |                              |                              |<---------------------------REFER----------------------------|                              |
12  66669             |                              |                              |------------------------202 Accepted------------------------>|                              |
13  66671             |                              |                              |-------------------------------------INVITE 4186437880------------------------------------->|
14  66677             |                              |                              |<----------------------------------302 Moved Temporarily------------------------------------|
15  66678             |                              |                              |---------------------------------------ACK 4186437880-------------------------------------->|
16  66679             |<------------------INVITE 200004186437880--------------------|                              |                              |                              |
17  66688             |-------------------------100 Trying------------------------->|                              |                              |                              |
18  67626             |--------------------183 Session Progress-------------------->|                              |                              |                              |
19  67628             |<--------------------------INVITE----------------------------|                              |                              |                              |
20  67636             |-------------------------100 Trying------------------------->|                              |                              |                              |
21  67652             |---------------------------200 OK--------------------------->|                              |                              |                              |
22  67653             |<----------------------------ACK-----------------------------|                              |                              |                              |
23  72385             |---------------------------200 OK--------------------------->|                              |                              |                              |
24  72386             |<----------------------------ACK-----------------------------|                              |                              |                              |
25  72387             |                              |                              |-------------------------NOTIFY nvp------------------------->|                              |
26  72389             |                              |                              |<--------------------------200 Ok----------------------------|                              |
27  72389             |                              |                              |<----------------------------BYE-----------------------------|                              |
28  72390             |                              |                              |---------------------------200 OK--------------------------->|                              |
29  83975             |-----------------------------BYE---------------------------->|                              |                              |                              |
30  83975             |<--------------------------200 OK----------------------------|                              |                              |                              |
31  83976             |<----------------------------BYE-----------------------------|                              |                              |                              |
32  83984             |---------------------------200 OK--------------------------->|                              |                              |                              |

----- #1 Mon, 22 Nov 2010 08:30:18 188--------------------------------------------------------------------
INVITE sip:5143901033@142.125.224.25:12276;transport=UDP;user=phone SIP/2.0
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
To: <sip:5143901033@10.92.244.52:5060;user=phone>
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
CSeq: 1 INVITE
User-Agent: CS2000_NGSS/9.0
Remote-Party-ID: "CEGEP POCATIERE"<sip:4188561561@10.92.10.80;user=phone>; party=calling; privacy=off; screen=yes
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP 10.92.244.60:12716;branch=z9hG4bK6yhn455879296,SIP/2.0/UDP MTRLPQ02CAEMGC:5060;maddr=10.92.10.80;branch=z9hG4bK-28a2195-eb932e94-56e6722b;received=10.92.10.80
P-Asserted-Identity: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80;user=phone>
Max-Forwards: 69
Contact: <sip:10.92.10.80:5060;transport=UDP>
Supported: 100rel
Content-Type: application/sdp
Content-Length: 187

v=0
o=IWSPM 306162685 306162685 IN IP4 10.92.11.164
s=-
c=IN IP4 10.92.11.164
t=0 0
m=audio 33858 RTP/AVP 0 8 18 101
a=ptime:20
a=rtpmap:101 telephone-event/8000
a=fmtp:101 0-15


----- #2 Mon, 22 Nov 2010 08:30:18 189--------------------------------------------------------------------
SIP/2.0 100 Trying
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
Via: SIP/2.0/UDP 10.92.244.60:12716;branch=z9hG4bK6yhn455879296,SIP/2.0/UDP MTRLPQ02CAEMGC:5060;maddr=10.92.10.80;branch=z9hG4bK-28a2195-eb932e94-56e6722b;received=10.92.10.80
CSeq: 1 INVITE
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Content-Length: 0



----- #3 Mon, 22 Nov 2010 08:30:18 194--------------------------------------------------------------------
INVITE sip:5143901033@10.92.244.52:5066;transport=udp;voicexml=http%3A%2F%2F142.125.224.36%3A12270%2FRACJQRens%2FStartup.jsp%3FAdmin%3Dfalse%26clid%3D4188561561%26dnis%3D5143901033;nvp-company-name=Bell;nvp-application-name=RACJQRens;caller-number=4188561561 SIP/2.0
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 2 INVITE
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
Max-Forwards: 70
BillingID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
Remote-Party-ID: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;party=calling;screen=yes;privacy=off
To: <sip:5143901033@10.92.244.52:5060;user=phone>
Content-Type: application/sdp
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-64efd33be2f7853f9edcc4d84c4b71e9
Contact: <sip:142.125.224.36:12276;transport=udp>
P-Asserted-Identity: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>
Content-Length: 187

v=0
o=IWSPM 306162685 306162685 IN IP4 10.92.11.164
s=-
c=IN IP4 10.92.11.164
t=0 0
m=audio 33858 RTP/AVP 0 8 18 101
a=ptime:20
a=rtpmap:101 telephone-event/8000
a=fmtp:101 0-15


----- #4 Mon, 22 Nov 2010 08:30:18 197--------------------------------------------------------------------
SIP/2.0 100 Trying
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-64efd33be2f7853f9edcc4d84c4b71e9
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
To: <sip:5143901033@10.92.244.52:5060;user=phone>
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 2 INVITE
Contact: <sip:10.92.244.41:5062;transport=udp>
Content-Length: 0



----- #5 Mon, 22 Nov 2010 08:30:18 197--------------------------------------------------------------------
SIP/2.0 180 Ringing
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-64efd33be2f7853f9edcc4d84c4b71e9
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 2 INVITE
Contact: <sip:10.92.244.41:5062;transport=udp>
Content-Length: 0



----- #6 Mon, 22 Nov 2010 08:30:18 198--------------------------------------------------------------------
SIP/2.0 180 Ringing
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
Via: SIP/2.0/UDP 10.92.244.60:12716;branch=z9hG4bK6yhn455879296,SIP/2.0/UDP MTRLPQ02CAEMGC:5060;maddr=10.92.10.80;branch=z9hG4bK-28a2195-eb932e94-56e6722b;received=10.92.10.80
CSeq: 1 INVITE
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Content-Length: 0



----- #7 Mon, 22 Nov 2010 08:30:18 247--------------------------------------------------------------------
SIP/2.0 200 Ok
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-64efd33be2f7853f9edcc4d84c4b71e9
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 2 INVITE
Content-Type: application/sdp
Contact: <sip:nvp@10.92.244.41:5062>;transport=udp
Allow: INVITE,ACK,BYE,CANCEL,NOTIFY,INFO,OPTIONS
Supported:
User-Agent: Nuance/APSIP-NVP3.1-SP06-B00-NSRD00048944-NSRD00053757
Content-Length: 197

v=0
o=- 1290432615 1290432615 IN IP4 10.92.244.41 s=SIP Call t=0 0 m=audio 18682 RTP/AVP 0 101 c=IN IP4 10.92.244.41 a=rtpmap:0 PCMU/8000
a=rtpmap:101 telephone-event/8000
a=fmtp:101 0-15


----- #8 Mon, 22 Nov 2010 08:30:18 248--------------------------------------------------------------------
SIP/2.0 200 OK
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
Via: SIP/2.0/UDP 10.92.244.60:12716;branch=z9hG4bK6yhn455879296,SIP/2.0/UDP MTRLPQ02CAEMGC:5060;maddr=10.92.10.80;branch=z9hG4bK-28a2195-eb932e94-56e6722b;received=10.92.10.80
CSeq: 1 INVITE
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Contact: <sip:142.125.224.36:12276;transport=udp>
Content-Type: application/sdp
Content-Length: 197

v=0
o=- 1290432615 1290432615 IN IP4 10.92.244.41 s=SIP Call t=0 0 m=audio 18682 RTP/AVP 0 101 c=IN IP4 10.92.244.41 a=rtpmap:0 PCMU/8000
a=rtpmap:101 telephone-event/8000
a=fmtp:101 0-15


----- #9 Mon, 22 Nov 2010 08:30:18 257--------------------------------------------------------------------
ACK sip:142.125.224.36:12276;transport=udp SIP/2.0
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
CSeq: 1 ACK
User-Agent: CS2000_NGSS/9.0
Max-Forwards: 70
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP MTRLPQ02CAEMGC:5060;maddr=10.92.10.80;branch=z9hG4bK-28a2195-eb932eda-32d3ae67;received=10.92.10.80
Contact: <sip:10.92.10.80:5060;transport=UDP>
Supported: 100rel
Content-Length: 0



----- #10 Mon, 22 Nov 2010 08:30:18 258--------------------------------------------------------------------
ACK sip:nvp@10.92.244.41:5062 SIP/2.0
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 2 ACK
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-5b35660095ee86dfd3f98a30750585a5
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
Max-Forwards: 70
Content-Length: 0



----- #11 Mon, 22 Nov 2010 08:31:24 856--------------------------------------------------------------------
REFER sip:142.125.224.36:12276;transport=udp SIP/2.0
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
Contact: <sip:nvp@10.92.244.41:5062>;transport=udp
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 1 REFER
Refer-To: <sip:4186437880@localhost>;timeout=30s
Referred-By: <sip:5143901033@10.92.244.52:5060>;user=phone
Via: SIP/2.0/UDP 10.92.244.41:5062;branch=z9Hg4Bkcc0eeb84-1dd1-11b2-a1be-bed56fce387b
Max-Forwards: 70
Content-Length: 0



----- #12 Mon, 22 Nov 2010 08:31:24 857--------------------------------------------------------------------
SIP/2.0 202 Accepted
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
Via: SIP/2.0/UDP 10.92.244.41:5062;branch=z9Hg4Bkcc0eeb84-1dd1-11b2-a1be-bed56fce387b
CSeq: 1 REFER
Call-ID: s1460-8345703489627602869@142.125.224.36
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
Content-Length: 0



----- #13 Mon, 22 Nov 2010 08:31:24 859--------------------------------------------------------------------
INVITE sip:4186437880@10.92.244.52:12786;transport=udp SIP/2.0
Call-ID: s1460-8579646444826495654@142.125.224.36
CSeq: 2 INVITE
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8579646444826495654
To: <sip:4186437880@10.92.244.52:12786>
Max-Forwards: 70
Remote-Party-ID: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;party=calling;screen=yes;privacy=off
Content-Type: application/sdp
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-00ee140445f492f28f032f7dbd17f7a8
Contact: <sip:142.125.224.36:12276;transport=udp>
P-Asserted-Identity: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>
Content-Length: 187

v=0
o=IWSPM 306162685 306162685 IN IP4 10.92.11.164
s=-
c=IN IP4 10.92.11.164
t=0 0
m=audio 33858 RTP/AVP 0 8 18 101
a=ptime:20
a=rtpmap:101 telephone-event/8000
a=fmtp:101 0-15


----- #14 Mon, 22 Nov 2010 08:31:24 865--------------------------------------------------------------------
SIP/2.0 302 Moved Temporarily
To: <sip:4186437880@10.92.244.52:12786>;tag=s961817-5224603105016864521
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-00ee140445f492f28f032f7dbd17f7a8
CSeq: 2 INVITE
Call-ID: s1460-8579646444826495654@142.125.224.36
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8579646444826495654
Contact: <sip:200004186437880@10.92.10.80;transport=udp;user=phone>;q=0.667,<sip:200004186437880@10.92.6.80;transport=udp;user=phone>;q=0.334
Content-Length: 0



----- #15 Mon, 22 Nov 2010 08:31:24 866--------------------------------------------------------------------
ACK sip:4186437880@10.92.244.52:12786;transport=udp SIP/2.0
Call-ID: s1460-8579646444826495654@142.125.224.36
Max-Forwards: 70
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8579646444826495654
To: <sip:4186437880@10.92.244.52:12786>;tag=s961817-5224603105016864521
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-00ee140445f492f28f032f7dbd17f7a8
CSeq: 2 ACK
Content-Length: 0



----- #16 Mon, 22 Nov 2010 08:31:24 867--------------------------------------------------------------------
INVITE sip:200004186437880@10.92.10.80;transport=udp;user=phone SIP/2.0
Call-ID: s1460-6240023739594637478@142.125.224.36
CSeq: 2 INVITE
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-6240023739594637478
Max-Forwards: 70
Remote-Party-ID: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;party=calling;screen=yes;privacy=off
To: <sip:4186437880@10.92.244.52:12786>
Content-Type: application/sdp
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-54454414b0f080973a6dd97276529e42
Contact: <sip:142.125.224.36:12276;transport=udp>
P-Asserted-Identity: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>
Content-Length: 187

v=0
o=IWSPM 306162685 306162685 IN IP4 10.92.11.164
s=-
c=IN IP4 10.92.11.164
t=0 0
m=audio 33858 RTP/AVP 0 8 18 101
a=ptime:20
a=rtpmap:101 telephone-event/8000
a=fmtp:101 0-15


----- #17 Mon, 22 Nov 2010 08:31:24 876--------------------------------------------------------------------
SIP/2.0 100 Trying
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-6240023739594637478
To: <sip:4186437880@10.92.244.52:12786>;tag=4b1a2306802312010112283125
Call-ID: s1460-6240023739594637478@142.125.224.36
CSeq: 2 INVITE
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-54454414b0f080973a6dd97276529e42
Contact: <sip:10.92.10.80>
Content-Length: 0



----- #18 Mon, 22 Nov 2010 08:31:25 814--------------------------------------------------------------------
SIP/2.0 183 Session Progress
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-6240023739594637478
To: <sip:4186437880@10.92.244.52:12786>;tag=4b1a2306802312010112283125
Call-ID: s1460-6240023739594637478@142.125.224.36
CSeq: 2 INVITE
Server: CS2000_NGSS/9.0
Supported: 100rel
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-54454414b0f080973a6dd97276529e42
Contact: <sip:10.92.10.80>
Content-Type: application/sdp
Content-Length: 151

v=0
o=PVG 1290431934250 1290431934250 IN IP4 10.92.11.220
s=-
p=+1 6135555555
c=IN IP4 10.92.11.220
t=0 0
m=audio 51614 RTP/AVP 0 8
a=ptime:20


----- #19 Mon, 22 Nov 2010 08:31:25 816--------------------------------------------------------------------
INVITE sip:10.92.10.80:5060;transport=UDP SIP/2.0
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-e792de2de82f662ecf718a5948150172
CSeq: 1 INVITE
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
Max-Forwards: 70
Contact: <sip:142.125.224.36:12276;transport=udp>
Content-Type: application/sdp
Content-Length: 151

v=0
o=PVG 1290431934250 1290431934250 IN IP4 10.92.11.220
s=-
p=+1 6135555555
c=IN IP4 10.92.11.220
t=0 0
m=audio 51614 RTP/AVP 0 8
a=ptime:20


----- #20 Mon, 22 Nov 2010 08:31:25 824--------------------------------------------------------------------
SIP/2.0 100 Trying
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
CSeq: 1 INVITE
Server: CS2000_NGSS/9.0
Supported: 100rel
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-e792de2de82f662ecf718a5948150172
Contact: <sip:10.92.10.80:5060;transport=UDP>
Content-Length: 0



----- #21 Mon, 22 Nov 2010 08:31:25 840--------------------------------------------------------------------
SIP/2.0 200 OK
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
CSeq: 1 INVITE
Server: CS2000_NGSS/9.0
Supported: 100rel
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-e792de2de82f662ecf718a5948150172
Contact: <sip:10.92.10.80:5060;transport=UDP>
Content-Type: application/sdp
Content-Length: 128

v=0
o=IWSPM 306839393 306839393 IN IP4 10.92.11.164
s=-
c=IN IP4 10.92.11.164
t=0 0
m=audio 33858 RTP/AVP 0 8
a=ptime:20


----- #22 Mon, 22 Nov 2010 08:31:25 841--------------------------------------------------------------------
ACK sip:10.92.10.80:5060;transport=UDP SIP/2.0
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
CSeq: 1 ACK
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-d3f4005e9a3e9ae88cd1bca298a9c367
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Max-Forwards: 70
Content-Length: 0



----- #23 Mon, 22 Nov 2010 08:31:30 573--------------------------------------------------------------------
SIP/2.0 200 OK
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-6240023739594637478
To: <sip:4186437880@10.92.244.52:12786>;tag=4b1a2306802312010112283125
Call-ID: s1460-6240023739594637478@142.125.224.36
CSeq: 2 INVITE
Server: CS2000_NGSS/9.0
Supported: 100rel
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-54454414b0f080973a6dd97276529e42
Contact: <sip:10.92.10.80>
Content-Type: application/sdp
Content-Length: 151

v=0
o=PVG 1290431934250 1290431934250 IN IP4 10.92.11.220
s=-
p=+1 6135555555
c=IN IP4 10.92.11.220
t=0 0
m=audio 51614 RTP/AVP 0 8
a=ptime:20


----- #24 Mon, 22 Nov 2010 08:31:30 574--------------------------------------------------------------------
ACK sip:10.92.10.80 SIP/2.0
Call-ID: s1460-6240023739594637478@142.125.224.36
CSeq: 2 ACK
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-ee699ceb7d52de6ddaa1bb6877938a60
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-6240023739594637478
To: <sip:4186437880@10.92.244.52:12786>;tag=4b1a2306802312010112283125
Max-Forwards: 70
Content-Length: 0



----- #25 Mon, 22 Nov 2010 08:31:30 575--------------------------------------------------------------------
NOTIFY sip:nvp@10.92.244.41:5062 SIP/2.0
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-2088101729eb9273c9659d633707b4f1
CSeq: 3 NOTIFY
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
Call-ID: s1460-8345703489627602869@142.125.224.36
Max-Forwards: 70
Contact: <sip:142.125.224.36:12276;transport=udp>
Subscription-State: Terminated
Event: refer
Content-Type: message/sipfrag
Content-Length: 14

SIP/2.0 200 OK

----- #26 Mon, 22 Nov 2010 08:31:30 577--------------------------------------------------------------------
SIP/2.0 200 Ok
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-2088101729eb9273c9659d633707b4f1
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 3 NOTIFY
Content-Length: 0



----- #27 Mon, 22 Nov 2010 08:31:30 577--------------------------------------------------------------------
BYE sip:142.125.224.36:12276;transport=udp SIP/2.0
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
Contact: <sip:10.92.244.41:5062;transport=udp>
Call-ID: s1460-8345703489627602869@142.125.224.36
CSeq: 2 BYE
Via: SIP/2.0/UDP 10.92.244.41:5062;branch=z9Hg4Bkcf77d10a-1dd1-11b2-a0f7-c13677308d7f
Max-Forwards: 70
Content-Length: 0



----- #28 Mon, 22 Nov 2010 08:31:30 578--------------------------------------------------------------------
SIP/2.0 200 OK
To: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-8345703489627602869
Via: SIP/2.0/UDP 10.92.244.41:5062;branch=z9Hg4Bkcf77d10a-1dd1-11b2-a0f7-c13677308d7f
CSeq: 2 BYE
Call-ID: s1460-8345703489627602869@142.125.224.36
From: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=nu-b9ed-bd51
Content-Length: 0



----- #29 Mon, 22 Nov 2010 08:31:42 163--------------------------------------------------------------------
BYE sip:142.125.224.36:12276;transport=udp SIP/2.0
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
CSeq: 2 BYE
User-Agent: CS2000_NGSS/9.0
Reason: Q.850;cause=16;text="Normal call clearing"
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP MTRLPQ02CAEMGC:5060;maddr=10.92.10.80;branch=z9hG4bK-28a21e9-eb94769a-77d2e2ea;received=10.92.10.80
Max-Forwards: 70
Supported: 100rel
Content-Length: 0



----- #30 Mon, 22 Nov 2010 08:31:42 163--------------------------------------------------------------------
SIP/2.0 200 OK
To: <sip:5143901033@10.92.244.52:5060;user=phone>;tag=s1460-8525511128105397629
Via: SIP/2.0/UDP MTRLPQ02CAEMGC:5060;maddr=10.92.10.80;branch=z9hG4bK-28a21e9-eb94769a-77d2e2ea;received=10.92.10.80
CSeq: 2 BYE
Call-ID: a626b0d8500a5c0a13c428a2195eb932e94a1e8c7d3c4deaf0-0209-7451
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80:5060;user=phone>;tag=-45026-28a2195-3bc1429d-28a2195
Content-Length: 0



----- #31 Mon, 22 Nov 2010 08:31:42 164--------------------------------------------------------------------
BYE sip:10.92.10.80 SIP/2.0
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-b9d24d25a48a000ae72a16211c05be44
CSeq: 3 BYE
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-6240023739594637478
To: <sip:4186437880@10.92.244.52:12786>;tag=4b1a2306802312010112283125
Call-ID: s1460-6240023739594637478@142.125.224.36
Max-Forwards: 70
Content-Length: 0



----- #32 Mon, 22 Nov 2010 08:31:42 172--------------------------------------------------------------------
SIP/2.0 200 OK
From: "CEGEP POCATIERE" <sip:4188561561@10.92.10.80>;tag=s1460-6240023739594637478
To: <sip:4186437880@10.92.244.52:12786>;tag=4b1a2306802312010112283125
Call-ID: s1460-6240023739594637478@142.125.224.36
CSeq: 3 BYE
Server: CS2000_NGSS/9.0
Supported: 100rel
Allow: ACK,BYE,CANCEL,INVITE,OPTIONS,INFO,SUBSCRIBE,REFER,NOTIFY,PRACK,UPDATE
Via: SIP/2.0/UDP 142.125.224.36:12276;branch=z9hG4bK-323031-b9d24d25a48a000ae72a16211c05be44
Content-Length: 0




```