package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import l.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {
    public CharSequence A;
    public final /* synthetic */ d D;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f8996a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9003h;

    /* renamed from: i, reason: collision with root package name */
    public int f9004i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f9005k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f9006l;

    /* renamed from: m, reason: collision with root package name */
    public int f9007m;

    /* renamed from: n, reason: collision with root package name */
    public char f9008n;

    /* renamed from: o, reason: collision with root package name */
    public int f9009o;

    /* renamed from: p, reason: collision with root package name */
    public char f9010p;

    /* renamed from: q, reason: collision with root package name */
    public int f9011q;

    /* renamed from: r, reason: collision with root package name */
    public int f9012r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9013s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9014t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9015u;

    /* renamed from: v, reason: collision with root package name */
    public int f9016v;

    /* renamed from: w, reason: collision with root package name */
    public int f9017w;

    /* renamed from: x, reason: collision with root package name */
    public String f9018x;

    /* renamed from: y, reason: collision with root package name */
    public String f9019y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f9020z;
    public ColorStateList B = null;
    public PorterDuff.Mode C = null;

    /* renamed from: b, reason: collision with root package name */
    public int f8997b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f8998c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8999d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f9000e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9001f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9002g = true;

    public c(d dVar, Menu menu) {
        this.D = dVar;
        this.f8996a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.D.f9025c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        d dVar = this.D;
        Context context = dVar.f9025c;
        boolean z2 = false;
        menuItem.setChecked(this.f9013s).setVisible(this.f9014t).setEnabled(this.f9015u).setCheckable(this.f9012r >= 1).setTitleCondensed(this.f9006l).setIcon(this.f9007m);
        int i10 = this.f9016v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        if (this.f9019y != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (dVar.f9026d == null) {
                dVar.f9026d = d.a(context);
            }
            Object obj = dVar.f9026d;
            String str = this.f9019y;
            b bVar = new b();
            bVar.f8994a = obj;
            Class<?> cls = obj.getClass();
            try {
                bVar.f8995b = cls.getMethod(str, b.f8993c);
                menuItem.setOnMenuItemClickListener(bVar);
            } catch (Exception e10) {
                StringBuilder sbK = m6.a.k("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbK.append(cls.getName());
                InflateException inflateException = new InflateException(sbK.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }
        if (this.f9012r >= 2 && (menuItem instanceof i)) {
            i iVar = (i) menuItem;
            iVar.f9818x = (iVar.f9818x & (-5)) | 4;
        }
        String str2 = this.f9018x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, d.f9021e, dVar.f9023a));
            z2 = true;
        }
        int i11 = this.f9017w;
        if (i11 > 0) {
            if (z2) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i11);
            }
        }
        CharSequence charSequence = this.f9020z;
        boolean z10 = menuItem instanceof i;
        if (z10) {
            ((i) menuItem).c(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.A;
        if (z10) {
            ((i) menuItem).e(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c6 = this.f9008n;
        int i12 = this.f9009o;
        if (z10) {
            ((i) menuItem).setAlphabeticShortcut(c6, i12);
        } else {
            menuItem.setAlphabeticShortcut(c6, i12);
        }
        char c10 = this.f9010p;
        int i13 = this.f9011q;
        if (z10) {
            ((i) menuItem).setNumericShortcut(c10, i13);
        } else {
            menuItem.setNumericShortcut(c10, i13);
        }
        PorterDuff.Mode mode = this.C;
        if (mode != null) {
            if (z10) {
                ((i) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.B;
        if (colorStateList != null) {
            if (z10) {
                ((i) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
