package vortex;


/**
* vortex/LongKeyedString.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/vortex-builtin-types/src/main/idl/vortex_builtin_types.idl
* Monday, February 29, 2016 3:24:12 PM EST
*/

/**
* Updated by idl2j
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/vortex-builtin-types/src/main/idl/vortex_builtin_types.idl
* Monday, February 29, 2016 3:24:12 o'clock PM EST
*/

import com.prismtech.cafe.dcps.keys.KeyList;

@KeyList(
    topicType = "LongKeyedString",
    keys = {"key"}
)
public final class LongKeyedString implements org.omg.CORBA.portable.IDLEntity
{
  public int key = (int)0;
  public String value = null;

  public LongKeyedString ()
  {
  } // ctor

  public LongKeyedString (int _key, String _value)
  {
    key = _key;
    value = _value;
  } // ctor

} // class LongKeyedString
