package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import l.h;
import m.n0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f9021e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f9022f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9023a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9024b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9025c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9026d;

    static {
        Class[] clsArr = {Context.class};
        f9021e = clsArr;
        f9022f = clsArr;
    }

    public d(Context context) {
        super(context);
        this.f9025c = context;
        Object[] objArr = {context};
        this.f9023a = objArr;
        this.f9024b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        c cVar = new c(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z10 = false;
        String str = null;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i10) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z2 = z2;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z10 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            cVar.f8997b = 0;
                            cVar.f8998c = 0;
                            cVar.f8999d = 0;
                            cVar.f9000e = 0;
                            cVar.f9001f = true;
                            cVar.f9002g = true;
                        } else if (name2.equals("item")) {
                            if (!cVar.f9003h) {
                                cVar.f9003h = true;
                                cVar.b(cVar.f8996a.add(cVar.f8997b, cVar.f9004i, cVar.j, cVar.f9005k));
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z2 = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z2 = z2;
                    }
                }
                eventType = xmlPullParser2.next();
                i10 = 2;
                z2 = z2;
                z10 = z10;
            } else {
                if (!z10) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.f9025c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f8058m);
                        cVar.f8997b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        cVar.f8998c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        cVar.f8999d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        cVar.f9000e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        cVar.f9001f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        cVar.f9002g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f8059n);
                            cVar.f9004i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            cVar.j = (typedArrayObtainStyledAttributes2.getInt(5, cVar.f8998c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, cVar.f8999d) & 65535);
                            cVar.f9005k = typedArrayObtainStyledAttributes2.getText(7);
                            cVar.f9006l = typedArrayObtainStyledAttributes2.getText(8);
                            cVar.f9007m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            cVar.f9008n = string == null ? (char) 0 : string.charAt(0);
                            cVar.f9009o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            cVar.f9010p = string2 == null ? (char) 0 : string2.charAt(0);
                            cVar.f9011q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                cVar.f9012r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                cVar.f9012r = cVar.f9000e;
                            }
                            cVar.f9013s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            cVar.f9014t = typedArrayObtainStyledAttributes2.getBoolean(4, cVar.f9001f);
                            cVar.f9015u = typedArrayObtainStyledAttributes2.getBoolean(1, cVar.f9002g);
                            cVar.f9016v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            cVar.f9019y = typedArrayObtainStyledAttributes2.getString(12);
                            cVar.f9017w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            cVar.f9018x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z11 = string3 != null;
                            if (z11 && cVar.f9017w == 0 && cVar.f9018x == null) {
                                if (cVar.a(string3, f9022f, this.f9024b) != null) {
                                    throw new ClassCastException();
                                }
                            } else if (z11) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            cVar.f9020z = typedArrayObtainStyledAttributes2.getText(17);
                            cVar.A = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                cVar.C = n0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), cVar.C);
                            } else {
                                cVar.C = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = i4.c.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                cVar.B = colorStateList;
                            } else {
                                cVar.B = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            cVar.f9003h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            cVar.f9003h = true;
                            SubMenu subMenuAddSubMenu = cVar.f8996a.addSubMenu(cVar.f8997b, cVar.f9004i, cVar.j, cVar.f9005k);
                            cVar.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i10 = 2;
                        z2 = z2;
                        z10 = z10;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z2 = z2;
            }
            eventType = xmlPullParser2.next();
            i10 = 2;
            z2 = z2;
            z10 = z10;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof h)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z2 = false;
        try {
            try {
                layout = this.f9025c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof h) {
                    h hVar = (h) menu;
                    if (!hVar.f9788n) {
                        hVar.s();
                        z2 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z2) {
                    ((h) menu).r();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z2) {
                ((h) menu).r();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
