package CORBAImplementation;


/**
* CORBAImplementation/CORBAImplementationHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idl
* Friday, June 15, 2018 4:13:15 o'clock PM EDT
*/

abstract public class CORBAImplementationHelper
{
  private static String  _id = "IDL:CORBAImplementation/CORBAImplementation:1.0";

  public static void insert (org.omg.CORBA.Any a, CORBAImplementation that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CORBAImplementation extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CORBAImplementationHelper.id (), "CORBAImplementation");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CORBAImplementation read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CORBAImplementationStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CORBAImplementation value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CORBAImplementation narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CORBAImplementation)
      return (CORBAImplementation)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CORBAImplementationStub stub = new _CORBAImplementationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CORBAImplementation unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CORBAImplementation)
      return (CORBAImplementation)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _CORBAImplementationStub stub = new _CORBAImplementationStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
