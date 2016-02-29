package vortex;


/**
* vortex/ShortKeyedString.java .
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
    topicType = "ShortKeyedString",
    keys = {"key"}
)
public final class ShortKeyedString implements org.omg.CORBA.portable.IDLEntity
{
  public short key = (short)0;
  public String value = null;

  public ShortKeyedString ()
  {
  } // ctor

  public ShortKeyedString (short _key, String _value)
  {
    key = _key;
    value = _value;
  } // ctor

} // class ShortKeyedString
