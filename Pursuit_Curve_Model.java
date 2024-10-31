package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.HorizontalScrollArrangement;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.Ball;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.Clock;
class Screen1 extends Form implements HandlesEventDispatching {
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private Button ButtonCheckA;
  private Button ButtonCheckB;
  private Button ButtonCheckD;
  private HorizontalArrangement HorizontalArrangement2;
  private Label Graph_Size;
  private TextBox GraphSize_Input_Txtbx;
  private Label Label13;
  private HorizontalScrollArrangement HorizontalScrollArrangement1;
  private VerticalArrangement VerticalArrangement2;
  private Label LabelLeaderFunction;
  private Label Label1;
  private ListPicker ButtonDeg_of_NumSelect;
  private Label Label2;
  private ListPicker ButtonDeg_of_DenomSelect;
  private Label Label7;
  private HorizontalArrangement HorizontalArrangement1;
  private ListPicker ButtonChoose_Function;
  private VerticalArrangement VerticalArrangement3;
  private Label Label8;
  private ListPicker ButtonSelect_Term;
  private VerticalArrangement VerticalArrangement4;
  private Label Label_PosInitialF;
  private TextBox FollowerStart_Coor_Txtbx;
  private Label Label15;
  private TextBox FollowerSpeedInput_Txtbx;
  private VerticalArrangement VerticalArrangement1;
  private HorizontalArrangement Numerator;
  private HorizontalArrangement Term4;
  private TextBox Deg4Num_Txtbx;
  private Label Label4thX;
  private Label Label4thExp;
  private VerticalArrangement CenteringPlus4;
  private Label Label3;
  private HorizontalArrangement Term3;
  private TextBox Deg3Num_Txtbx;
  private Label Label3rdX;
  private Label Label3rdExp;
  private VerticalArrangement CenteringPlus3;
  private Label Label4;
  private HorizontalArrangement Term2;
  private TextBox Deg2Num_Txtbx;
  private Label Label2ndX;
  private Label Label2ndExp;
  private VerticalArrangement CenteringPlus2;
  private Label Label5;
  private HorizontalArrangement Term1;
  private TextBox Deg1Num_Txtbx;
  private Label Label1stX;
  private Label Label1stExp;
  private VerticalArrangement CenteringPlus1;
  private Label Label6;
  private HorizontalArrangement Term0;
  private TextBox Deg0Num_Txtbx;
  private Label Label0thX;
  private Label Label0thExp;
  private Image Fraction_Bar;
  private HorizontalArrangement Denominator;
  private HorizontalArrangement Copy_of_Numerator;
  private HorizontalArrangement Term4D;
  private TextBox Deg4Denom_Txtbx;
  private Label Label4thXD;
  private Label Label4thExpD;
  private VerticalArrangement CenteringPlus4D;
  private Label Label9;
  private HorizontalArrangement Term3D;
  private TextBox Deg3Denom_Txtbx;
  private Label Label3rdXD;
  private Label Label3rdExpD;
  private VerticalArrangement CenteringPlus3D;
  private Label Label10;
  private HorizontalArrangement Term2D;
  private TextBox Deg2Denom_Txtbx;
  private Label Label2ndXD;
  private Label Label2ndExpD;
  private VerticalArrangement CenteringPlus2D;
  private Label Label11;
  private HorizontalArrangement Term1D;
  private TextBox Deg1Denom_Txtbx;
  private Label Label1stXD;
  private Label Label1stExpD;
  private VerticalArrangement CenteringPlus1D;
  private Label Label12;
  private HorizontalArrangement Term0D;
  private TextBox Deg0Denom_Txtbx;
  private Label Label0thXD;
  private Label Label0thExpD;
  private HorizontalArrangement HorizontalArrangement3;
  private Button ButtonSet;
  private Button Button_Go;
  private Label Label14;
  private Canvas Canvas1;
  private Ball Leader_Mouse;
  private Ball Follower_Fox;
  private Notifier Notifier1;
  private Clock Clock1;
  protected void $define() {
    this.AppName("Create_Task");
    this.Scrollable(true);
    this.Title("Screen1");
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    ButtonCheckA = new Button(VerticalScrollArrangement1);
    ButtonCheckA.Text("CheckA");
    ButtonCheckA.Visible(false);
    ButtonCheckB = new Button(VerticalScrollArrangement1);
    ButtonCheckB.Text("CheckB");
    ButtonCheckB.Visible(false);
    ButtonCheckD = new Button(VerticalScrollArrangement1);
    ButtonCheckD.Text("Check D");
    ButtonCheckD.Visible(false);
    HorizontalArrangement2 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement2.AlignVertical(2);
    Graph_Size = new Label(HorizontalArrangement2);
    Graph_Size.Text("Graph Size:");
    GraphSize_Input_Txtbx = new TextBox(HorizontalArrangement2);
    GraphSize_Input_Txtbx.Height(35);
    GraphSize_Input_Txtbx.Width(50);
    GraphSize_Input_Txtbx.Hint("-min/max");
    GraphSize_Input_Txtbx.NumbersOnly(true);
    GraphSize_Input_Txtbx.Text("200");
    Label13 = new Label(HorizontalArrangement2);
    Label13.Text("by 200");
    HorizontalScrollArrangement1 = new HorizontalScrollArrangement(VerticalScrollArrangement1);
    VerticalArrangement2 = new VerticalArrangement(HorizontalScrollArrangement1);
    LabelLeaderFunction = new Label(VerticalArrangement2);
    LabelLeaderFunction.FontBold(true);
    LabelLeaderFunction.Text("Leader Function");
    Label1 = new Label(VerticalArrangement2);
    Label1.Text("Set Deg. of Numerator");
    ButtonDeg_of_NumSelect = new ListPicker(VerticalArrangement2);
    ButtonDeg_of_NumSelect.ElementsFromString("0,1,2,3,4");
    ButtonDeg_of_NumSelect.Text("Deg. of Numerator");
    Label2 = new Label(VerticalArrangement2);
    Label2.Text("Set Deg. of Denominator");
    ButtonDeg_of_DenomSelect = new ListPicker(VerticalArrangement2);
    ButtonDeg_of_DenomSelect.ElementsFromString("0,1,2,3,4");
    ButtonDeg_of_DenomSelect.Text("Deg. of Denominator");
    Label7 = new Label(VerticalArrangement2);
    Label7.Text("Set Composition Function, g(x), for x");
    HorizontalArrangement1 = new HorizontalArrangement(VerticalArrangement2);
    HorizontalArrangement1.AlignVertical(2);
    ButtonChoose_Function = new ListPicker(HorizontalArrangement1);
    ButtonChoose_Function.ElementsFromString("sinx,cosx,tanx,e^x,lnx,x");
    ButtonChoose_Function.Height(LENGTH_FILL_PARENT);
    ButtonChoose_Function.Text("Choose Function");
    VerticalArrangement3 = new VerticalArrangement(HorizontalArrangement1);
    Label8 = new Label(VerticalArrangement3);
    Label8.TextColor(0xFFFF0000);
    ButtonSelect_Term = new ListPicker(VerticalArrangement3);
    ButtonSelect_Term.Height(LENGTH_FILL_PARENT);
    ButtonSelect_Term.Text("Select Term");
    VerticalArrangement4 = new VerticalArrangement(HorizontalScrollArrangement1);
    VerticalArrangement4.Width(LENGTH_FILL_PARENT);
    Label_PosInitialF = new Label(VerticalArrangement4);
    Label_PosInitialF.Text("Follower Start Pos.");
    FollowerStart_Coor_Txtbx = new TextBox(VerticalArrangement4);
    FollowerStart_Coor_Txtbx.Width(100);
    FollowerStart_Coor_Txtbx.Hint("x,y    ");
    Label15 = new Label(VerticalArrangement4);
    Label15.Text("Follower Speed");
    FollowerSpeedInput_Txtbx = new TextBox(VerticalArrangement4);
    FollowerSpeedInput_Txtbx.Hint("Dependent on deriv.");
    VerticalArrangement1 = new VerticalArrangement(VerticalScrollArrangement1);
    VerticalArrangement1.Width(400);
    Numerator = new HorizontalArrangement(VerticalArrangement1);
    Numerator.Width(LENGTH_FILL_PARENT);
    Term4 = new HorizontalArrangement(Numerator);
    Term4.Height(LENGTH_FILL_PARENT);
    Term4.Width(LENGTH_FILL_PARENT);
    Deg4Num_Txtbx = new TextBox(Term4);
    Deg4Num_Txtbx.FontSize(14);
    Deg4Num_Txtbx.Width(30);
    Deg4Num_Txtbx.Hint("a");
    Label4thX = new Label(Term4);
    Label4thX.FontSize(24);
    Label4thX.Width(LENGTH_FILL_PARENT);
    Label4thX.Text("x");
    Label4thExp = new Label(Term4);
    Label4thExp.Width(LENGTH_FILL_PARENT);
    Label4thExp.Text("4");
    CenteringPlus4 = new VerticalArrangement(Term4);
    CenteringPlus4.AlignVertical(3);
    CenteringPlus4.Height(30);
    Label3 = new Label(CenteringPlus4);
    Label3.FontSize(10);
    Label3.Text("+");
    Term3 = new HorizontalArrangement(Numerator);
    Term3.Height(LENGTH_FILL_PARENT);
    Term3.Width(LENGTH_FILL_PARENT);
    Deg3Num_Txtbx = new TextBox(Term3);
    Deg3Num_Txtbx.Width(30);
    Deg3Num_Txtbx.Hint("b");
    Label3rdX = new Label(Term3);
    Label3rdX.FontSize(24);
    Label3rdX.Width(LENGTH_FILL_PARENT);
    Label3rdX.Text("x");
    Label3rdExp = new Label(Term3);
    Label3rdExp.Width(LENGTH_FILL_PARENT);
    Label3rdExp.Text("3");
    CenteringPlus3 = new VerticalArrangement(Term3);
    CenteringPlus3.AlignVertical(3);
    CenteringPlus3.Height(30);
    Label4 = new Label(CenteringPlus3);
    Label4.FontSize(10);
    Label4.Text("+");
    Term2 = new HorizontalArrangement(Numerator);
    Term2.Height(LENGTH_FILL_PARENT);
    Term2.Width(LENGTH_FILL_PARENT);
    Deg2Num_Txtbx = new TextBox(Term2);
    Deg2Num_Txtbx.Width(30);
    Deg2Num_Txtbx.Hint("c");
    Label2ndX = new Label(Term2);
    Label2ndX.FontSize(24);
    Label2ndX.Width(LENGTH_FILL_PARENT);
    Label2ndX.Text("x");
    Label2ndExp = new Label(Term2);
    Label2ndExp.Width(LENGTH_FILL_PARENT);
    Label2ndExp.Text("2");
    CenteringPlus2 = new VerticalArrangement(Term2);
    CenteringPlus2.AlignVertical(3);
    CenteringPlus2.Height(30);
    Label5 = new Label(CenteringPlus2);
    Label5.FontSize(10);
    Label5.Text("+");
    Term1 = new HorizontalArrangement(Numerator);
    Term1.Height(LENGTH_FILL_PARENT);
    Term1.Width(LENGTH_FILL_PARENT);
    Deg1Num_Txtbx = new TextBox(Term1);
    Deg1Num_Txtbx.Width(30);
    Deg1Num_Txtbx.Hint("d");
    Label1stX = new Label(Term1);
    Label1stX.FontSize(24);
    Label1stX.Width(LENGTH_FILL_PARENT);
    Label1stX.Text("x");
    Label1stExp = new Label(Term1);
    Label1stExp.Width(LENGTH_FILL_PARENT);
    Label1stExp.Text("1");
    CenteringPlus1 = new VerticalArrangement(Term1);
    CenteringPlus1.AlignVertical(3);
    CenteringPlus1.Height(30);
    Label6 = new Label(CenteringPlus1);
    Label6.FontSize(10);
    Label6.Text("+");
    Term0 = new HorizontalArrangement(Numerator);
    Term0.Width(LENGTH_FILL_PARENT);
    Deg0Num_Txtbx = new TextBox(Term0);
    Deg0Num_Txtbx.FontSize(14);
    Deg0Num_Txtbx.Width(30);
    Deg0Num_Txtbx.Hint("e");
    Label0thX = new Label(Term0);
    Label0thX.FontSize(24);
    Label0thX.Width(LENGTH_FILL_PARENT);
    Label0thX.Text("x");
    Label0thExp = new Label(Term0);
    Label0thExp.Width(LENGTH_FILL_PARENT);
    Label0thExp.Text("0");
    Fraction_Bar = new Image(VerticalArrangement1);
    Fraction_Bar.Height(3);
    Fraction_Bar.Width(LENGTH_FILL_PARENT);
    Fraction_Bar.Picture("newline.png");
    Fraction_Bar.ScalePictureToFit(true);
    Denominator = new HorizontalArrangement(VerticalArrangement1);
    Denominator.Width(LENGTH_FILL_PARENT);
    Copy_of_Numerator = new HorizontalArrangement(Denominator);
    Copy_of_Numerator.Width(LENGTH_FILL_PARENT);
    Term4D = new HorizontalArrangement(Copy_of_Numerator);
    Term4D.Height(LENGTH_FILL_PARENT);
    Term4D.Width(LENGTH_FILL_PARENT);
    Deg4Denom_Txtbx = new TextBox(Term4D);
    Deg4Denom_Txtbx.FontSize(14);
    Deg4Denom_Txtbx.Width(30);
    Deg4Denom_Txtbx.Hint("a");
    Label4thXD = new Label(Term4D);
    Label4thXD.FontSize(24);
    Label4thXD.Width(LENGTH_FILL_PARENT);
    Label4thXD.Text("x");
    Label4thExpD = new Label(Term4D);
    Label4thExpD.Width(LENGTH_FILL_PARENT);
    Label4thExpD.Text("4");
    CenteringPlus4D = new VerticalArrangement(Term4D);
    CenteringPlus4D.AlignVertical(3);
    CenteringPlus4D.Height(30);
    Label9 = new Label(CenteringPlus4D);
    Label9.FontSize(10);
    Label9.Text("+");
    Term3D = new HorizontalArrangement(Copy_of_Numerator);
    Term3D.Height(LENGTH_FILL_PARENT);
    Term3D.Width(LENGTH_FILL_PARENT);
    Deg3Denom_Txtbx = new TextBox(Term3D);
    Deg3Denom_Txtbx.Width(30);
    Deg3Denom_Txtbx.Hint("b");
    Label3rdXD = new Label(Term3D);
    Label3rdXD.FontSize(24);
    Label3rdXD.Width(LENGTH_FILL_PARENT);
    Label3rdXD.Text("x");
    Label3rdExpD = new Label(Term3D);
    Label3rdExpD.Width(LENGTH_FILL_PARENT);
    Label3rdExpD.Text("3");
    CenteringPlus3D = new VerticalArrangement(Term3D);
    CenteringPlus3D.AlignVertical(3);
    CenteringPlus3D.Height(30);
    Label10 = new Label(CenteringPlus3D);
    Label10.FontSize(10);
    Label10.Text("+");
    Term2D = new HorizontalArrangement(Copy_of_Numerator);
    Term2D.Height(LENGTH_FILL_PARENT);
    Term2D.Width(LENGTH_FILL_PARENT);
    Deg2Denom_Txtbx = new TextBox(Term2D);
    Deg2Denom_Txtbx.Width(30);
    Deg2Denom_Txtbx.Hint("c");
    Label2ndXD = new Label(Term2D);
    Label2ndXD.FontSize(24);
    Label2ndXD.Width(LENGTH_FILL_PARENT);
    Label2ndXD.Text("x");
    Label2ndExpD = new Label(Term2D);
    Label2ndExpD.Width(LENGTH_FILL_PARENT);
    Label2ndExpD.Text("2");
    CenteringPlus2D = new VerticalArrangement(Term2D);
    CenteringPlus2D.AlignVertical(3);
    CenteringPlus2D.Height(30);
    Label11 = new Label(CenteringPlus2D);
    Label11.FontSize(10);
    Label11.Text("+");
    Term1D = new HorizontalArrangement(Copy_of_Numerator);
    Term1D.Height(LENGTH_FILL_PARENT);
    Term1D.Width(LENGTH_FILL_PARENT);
    Deg1Denom_Txtbx = new TextBox(Term1D);
    Deg1Denom_Txtbx.Width(30);
    Deg1Denom_Txtbx.Hint("d");
    Label1stXD = new Label(Term1D);
    Label1stXD.FontSize(24);
    Label1stXD.Width(LENGTH_FILL_PARENT);
    Label1stXD.Text("x");
    Label1stExpD = new Label(Term1D);
    Label1stExpD.Width(LENGTH_FILL_PARENT);
    Label1stExpD.Text("1");
    CenteringPlus1D = new VerticalArrangement(Term1D);
    CenteringPlus1D.AlignVertical(3);
    CenteringPlus1D.Height(30);
    Label12 = new Label(CenteringPlus1D);
    Label12.FontSize(10);
    Label12.Text("+");
    Term0D = new HorizontalArrangement(Copy_of_Numerator);
    Term0D.Width(LENGTH_FILL_PARENT);
    Deg0Denom_Txtbx = new TextBox(Term0D);
    Deg0Denom_Txtbx.FontSize(14);
    Deg0Denom_Txtbx.Width(30);
    Deg0Denom_Txtbx.Hint("e");
    Label0thXD = new Label(Term0D);
    Label0thXD.FontSize(24);
    Label0thXD.Width(LENGTH_FILL_PARENT);
    Label0thXD.Text("x");
    Label0thExpD = new Label(Term0D);
    Label0thExpD.Width(LENGTH_FILL_PARENT);
    Label0thExpD.Text("0");
    HorizontalArrangement3 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement3.AlignVertical(2);
    ButtonSet = new Button(HorizontalArrangement3);
    ButtonSet.Text("Set Graph");
    Button_Go = new Button(HorizontalArrangement3);
    Button_Go.Text("GO");
    Label14 = new Label(HorizontalArrangement3);
    Label14.Text(" ");
    Canvas1 = new Canvas(VerticalScrollArrangement1);
    Canvas1.BackgroundColor(0xFFB6EEFF);
    Canvas1.Height(400);
    Canvas1.Width(400);
    Leader_Mouse = new Ball(Canvas1);
    Leader_Mouse.Initialize();
    Leader_Mouse.X(217);
    Leader_Mouse.Y(61);
    Follower_Fox = new Ball(Canvas1);
    Follower_Fox.Initialize();
    Follower_Fox.Enabled(false);
    Follower_Fox.PaintColor(0xFFFF0000);
    Follower_Fox.X(140);
    Follower_Fox.Y(40);
    Notifier1 = new Notifier(this);
    Clock1 = new Clock(this);
    Clock1.TimerEnabled(false);
    Clock1.TimerInterval(125);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}