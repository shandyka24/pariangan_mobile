
package b4a.DesaWisataSumpu;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xformatter {
    public static RemoteObject myClass;
	public b4xformatter() {
	}
    public static PCBA staticBA = new PCBA(null, b4xformatter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _formats = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _max_value = RemoteObject.createImmutable(0);
public static RemoteObject _min_value = RemoteObject.createImmutable(0);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.DesaWisataSumpu.main _main = null;
public static b4a.DesaWisataSumpu.core _core = null;
public static b4a.DesaWisataSumpu.detailev _detailev = null;
public static b4a.DesaWisataSumpu.detailrg _detailrg = null;
public static b4a.DesaWisataSumpu.homeuser _homeuser = null;
public static b4a.DesaWisataSumpu.homevisitor _homevisitor = null;
public static b4a.DesaWisataSumpu.listev _listev = null;
public static b4a.DesaWisataSumpu.listrg _listrg = null;
public static b4a.DesaWisataSumpu.mapsev _mapsev = null;
public static b4a.DesaWisataSumpu.mapsrg _mapsrg = null;
public static b4a.DesaWisataSumpu.starter _starter = null;
public static b4a.DesaWisataSumpu.httputils2service _httputils2service = null;
public static b4a.DesaWisataSumpu.b4xcollections _b4xcollections = null;
public static b4a.DesaWisataSumpu.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"formats",_ref.getField(false, "_formats"),"MAX_VALUE",_ref.getField(false, "_max_value"),"MIN_VALUE",_ref.getField(false, "_min_value"),"xui",_ref.getField(false, "_xui")};
}
}