B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim nameRG As String
	Dim facilityMap As Map
	Dim isFiltered As Boolean = False
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSettings As WebViewSettings
	Private PanelRG As Panel
	Private WebViewRG As WebView
	Private BtnBack As Button
	Private Navbar As Panel
	Private MainScroll As ScrollView
	Private btnUserLoc As Button
	Private btnObj As Button
	Private btnList As Button
	Private btnList2 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")

	Starter.mapStatus = "RG"
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsRG")
	Navbar.Visible = False
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
	End If
	WebViewRG.Height = MainScroll.Height
	PanelRG.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	
	MyWebViewExtras.addWebChromeClient(WebViewRG, "WebViewRG")
	WebViewRG.JavaScriptEnabled = True
	WebViewRG.LoadUrl(Main.server&"web/list_homestay_mobile")
		
	btnObj.Visible = False
	btnUserLoc.Visible = False
	btnList.Visible = False
	btnList2.Visible = False
	
	
	Core.ExecuteUrlGet(Main.API&"facility", "LoadFacility", Me)	
End Sub

Sub Activity_Resume
	Log("MapsRG Loaded")	
	If Starter.GPS1.GPSEnabled = False Then
		ToastMessageShow("Please enable the GPS device.", True)
		StartActivity(Starter.GPS1.LocationSettingsIntent)
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then 
			CallSubDelayed(Starter, "StartGPS")
		Else
			ToastMessageShow("Please allow GPS to run this appliation", True)
			Activity.Finish
		End If
	End If	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSubDelayed(Starter, "StopGPS")
End Sub

Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Starter.mapStatus = ""
	Activity.Finish
End Sub

Public Sub UpdateLocation
	Log("Update user position on Maps Rumah Gadang")
	Log("Lat: "&Starter.lat&"; Long: "&Starter.lng)
	Dim userPosition As String
	userPosition = "userPositionAPI("&Starter.lat&", "&Starter.lng&")"
	MyWebViewExtras.executeJavascript(WebViewRG, userPosition)
End Sub

Sub WebViewRG_ProgressChanged(loading As Int)
	If loading == 100 Then
		Log("Webview loaded")
		Starter.webviewLoading = loading
		btnObj.Visible = True
		btnUserLoc.Visible = True
		btnList.Visible = True
		btnList2.Visible = True
		UpdateLocation
	Else
		Log("Webview loading at "&loading&"% ....")
	End If
End Sub

Private Sub btnUserLoc_Click
	Log("Panning to user location")
	UpdateLocation
	Dim panToUser As String = "panToUser()"
	MyWebViewExtras.executeJavascript(WebViewRG, panToUser)
End Sub

Private Sub btnObj_Click
	Log("Pan to Rumah Gadang")
	Dim boundToObject As String
	If isFiltered Then
		boundToObject = "findRG('')"
		isFiltered = False
	Else
		boundToObject = "boundToObject(false)"
	End If
	MyWebViewExtras.executeJavascript(WebViewRG, boundToObject)
End Sub


Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		
		Select Job.JobName
			Case "LoadFacility"
				Try
					Dim map As Map
					map = parser.NextObject
					Dim data As List
					data = map.Get("data")
					facilityMap.Initialize					
					For i = 0 To data.Size - 1
						Dim facility As Map
						facility = data.Get(i)
						facilityMap.Put(facility.Get("facility"), facility.Get("id"))						
					Next
				Catch
					Log(LastException)
				End Try
		End Select
	End If
End Sub

Private Sub WebViewRG_PageFinished (Url As String)
	
End Sub

Private Sub btnList_Click
	Log("Redirect to ListRG activity")
	StartActivity(ListRG)
End Sub

Private Sub btnList2_Click
	Log("Redirect to ListRG activity")
	StartActivity(ListRG)
End Sub

