package DDS;


/**
* DDS/KeyedStringSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/tmcclean/Projects/github-repositories/vortex-builtin-types/dds-builtin-types/src/main/idl/dds_builtin_types.idl
* Monday, February 29, 2016 3:24:09 PM EST
*/

abstract public class KeyedStringSeqHelper
{
  private static String  _id = "IDL:DDS/KeyedStringSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, DDS.KeyedString[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static DDS.KeyedString[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = DDS.KeyedStringHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (DDS.KeyedStringSeqHelper.id (), "KeyedStringSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static DDS.KeyedString[] read (org.omg.CORBA.portable.InputStream istream)
  {
    DDS.KeyedString value[] = null;
    int _len0 = istream.read_long ();
    value = new DDS.KeyedString[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = DDS.KeyedStringHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, DDS.KeyedString[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      DDS.KeyedStringHelper.write (ostream, value[_i0]);
  }

}
