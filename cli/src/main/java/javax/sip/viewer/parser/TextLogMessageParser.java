package javax.sip.viewer.parser;

/**
 * @copyright ©2012, Bell Canada
 * @author mathieu.marcotte-gag (CTS)
 */
public class TextLogMessageParser {

  // Parse with a little state machine (more complex than regexes but faster)
  static final int STATE_DEFAULT = 0;
  static final int STATE_CALLID_C = 1;
  static final int STATE_CALLID_A = 2;
  static final int STATE_CALLID_L1 = 3;
  static final int STATE_CALLID_L2 = 4;
  static final int STATE_CALLID_DASH = 5;
  static final int STATE_CALLID_I = 6;
  static final int STATE_CALLID_D = 7;
  static final int STATE_CALL_ID_COLON = 8;
  static final int STATE_CALL_ID = 9;
  static final int STATE_FROM_F = 10;
  static final int STATE_FROM_R = 11;
  static final int STATE_FROM_O = 12;
  static final int STATE_FROM_M = 13;
  static final int STATE_FROM_COLON = 14;
  static final int STATE_FROM = 15;
  static final int STATE_TO_T = 16;
  static final int STATE_TO_O = 17;
  static final int STATE_TO_COLON = 18;
  static final int STATE_TO = 19;
  static final int STATE_EVENT_E = 20;
  static final int STATE_EVENT_V = 21;
  static final int STATE_EVENT_E2 = 22;
  static final int STATE_EVENT_N = 23;
  static final int STATE_EVENT_T = 24;
  static final int STATE_EVENT_COLON = 25;
  static final int STATE_EVENT = 26;

  /**
   * 
   * @param pMessage input to parse
   * @param lCallId output goes there
   * @param lFrom output goes there
   * @param lTo output goes there
   */
  public static void parse(String pMessage,
                           StringBuilder lCallId,
                           StringBuilder lFrom,
                           StringBuilder lTo,
                           StringBuilder lEvent)
  {
    // Parse with a little state machine (more complex than regexes but faster)
    int state = STATE_DEFAULT;

    for (int n = 0; n < pMessage.length(); n++) {
      char c = pMessage.charAt(n);

      switch (state) {
      case STATE_DEFAULT:
        if (c == 'C')
          state = STATE_CALLID_C;
        else if (c == 'F')
          state = STATE_FROM_F;
        else if (c == 'T')
          state = STATE_TO_T;
        else if (c == 'E')
          state = STATE_EVENT_E;
        break;

      // -- Call-ID
      case STATE_CALLID_C:
        if (c == 'a')
          state = STATE_CALLID_A;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_CALLID_A:
        if (c == 'l')
          state = STATE_CALLID_L1;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_CALLID_L1:
        if (c == 'l')
          state = STATE_CALLID_L2;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_CALLID_L2:
        if (c == '-')
          state = STATE_CALLID_DASH;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_CALLID_DASH:
        if (c == 'I')
          state = STATE_CALLID_I;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_CALLID_I:
        if (c == 'D')
          state = STATE_CALLID_D;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_CALLID_D:
        if (c == ':')
          state = STATE_CALL_ID_COLON;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_CALL_ID_COLON:
        if (c == ' ')
          continue;
        else
          state = STATE_CALL_ID;

        // fall-through intended
      case STATE_CALL_ID:
        if (c == '\n' || c == '\r')
          state = STATE_DEFAULT;
        else
          lCallId.append(c);
        break;

      // -- From
      case STATE_FROM_F:
        if (c == 'r')
          state = STATE_FROM_R;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_FROM_R:
        if (c == 'o')
          state = STATE_FROM_O;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_FROM_O:
        if (c == 'm')
          state = STATE_FROM_M;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_FROM_M:
        if (c == ':')
          state = STATE_FROM_COLON;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_FROM_COLON:
        if (c == ' ')
          continue;
        else
          state = STATE_FROM;

        // Fall-through intended
      case STATE_FROM:
        if (c == '\n' || c == '\r')
          state = STATE_DEFAULT;
        else
          lFrom.append(c);
        break;

      // -- TO
      case STATE_TO_T:
        if (c == 'o')
          state = STATE_TO_O;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_TO_O:
        if (c == ':')
          state = STATE_TO_COLON;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_TO_COLON:
        if (c == ' ')
          continue;
        else
          state = STATE_TO;
        // Fall-through intended
      case STATE_TO:
        if (c == '\n' || c == '\r')
          state = STATE_DEFAULT;
        else
          lTo.append(c);
        break;

      // -- EVENT
      case STATE_EVENT_E:
        if (c == 'v')
          state = STATE_EVENT_V;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_EVENT_V:
        if (c == 'e')
          state = STATE_EVENT_E2;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_EVENT_E2:
        if (c == 'n')
          state = STATE_EVENT_N;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_EVENT_N:
        if (c == 't')
          state = STATE_EVENT_T;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_EVENT_T:
        if (c == ':')
          state = STATE_EVENT_COLON;
        else
          state = STATE_DEFAULT;
        break;
      case STATE_EVENT_COLON:
        if (c == ' ')
          continue;
        else
          state = STATE_EVENT;

        // Fall-through intended
      case STATE_EVENT:
        if (c == '\n' || c == '\r')
          state = STATE_DEFAULT;
        else
          lEvent.append(c);
        break;
      }
    }
  }

  static final int STATE_DATE_TIME = 1;
  static final int STATE_INOUT = 2;
  static final int STATE_IN_N = 3;
  static final int STATE_OUT_U = 4;
  static final int STATE_OUT_T = 5;
  static final int STATE_ORIGIN = 6;
  static final int STATE_ARROW = 7;
  static final int STATE_DESTINATION = 8;

  /**
   * 
   * @param pDetails the string to parse
   * @param pDate out
   * @param pOrigin out
   * @param pDestination out
   * @param lDirection
   */
  public static void parseDetails(String pDetails,
                                  StringBuilder pDate,
                                  StringBuilder pOrigin,
                                  StringBuilder pDestination,
                                  StringBuilder pDirection)
  {
    int state = STATE_DEFAULT;
    boolean stopParsing = false;

    for (int n = 0; n < pDetails.length(); n++) {

      if(stopParsing) {
        break;
      }

      char c = pDetails.charAt(n);

      switch (state) {
      // -- date
      case STATE_DEFAULT:
        if (c == '[')
          state = STATE_DATE_TIME;
        break;
      case STATE_DATE_TIME:
        if (c == ']')
          state = STATE_INOUT;
        else
          pDate.append(c);
        break;

      // -- in or out
      case STATE_INOUT:
        if (c == ' ')
          continue;
        else if (c == 'I') {
          state = STATE_IN_N;
          pDirection.append(c);
        } else if (c == 'O') {
          state = STATE_OUT_U;
          pDirection.append(c);
        } else {
          throw new RuntimeException("Expected IN or OUT, found unexpected char " + c);
        }
        break;
      case STATE_IN_N:
        if (c == 'N') {
          state = STATE_ORIGIN;
          pDirection.append(c);
        } else {
          throw new RuntimeException("Expected IN, found unexpected char " + c);
        }
        break;
      case STATE_OUT_U:
        if (c == 'U') {
          state = STATE_OUT_T;
          pDirection.append(c);
        } else {
          throw new RuntimeException("Expected OUT, found unexpected char " + c);
        }
        break;
      case STATE_OUT_T:
        if (c == 'T') {
          state = STATE_ORIGIN;
          pDirection.append(c);
        } else {
          throw new RuntimeException("Expected OUT, found unexpected char " + c);
        }
        break;

      // -- origin
      case STATE_ORIGIN:
        if (c == ' ')
          continue;
        else if (c == '-')
          state = STATE_ARROW;
        else
          pOrigin.append(c);
        break;

      // -- arrow
      case STATE_ARROW:
        if (c == '-')
          continue;
        else if (c == '>')
          state = STATE_DESTINATION;
        break;

      // -- destination
      case STATE_DESTINATION:
        if (c == ' ' && pDestination.length() == 0)
          continue;
        else if (c == ' ' || c == '\n' || c == '\r')
          stopParsing = true;
        else
          pDestination.append(c);
        break;
      }
    }
  }

  /**
   * Split a string in 2 parts, first the details then the rest of the message.
   * This method is more efficient than using Scanner with a regex.
   * 
   * @param pStr
   * @return the 2 parts
   */
  public static String[] splitIn2Parts(String pStr) {
    String[] lOut = new String[2];
    int lFirstLineBreak = pStr.indexOf('\n');
    lOut[0] = pStr.substring(0, lFirstLineBreak).trim();
    // skip second line because it is empty.
    lOut[1] = pStr.substring(pStr.indexOf('\n', lFirstLineBreak) + 1).trim();

    return lOut;
  }
}
