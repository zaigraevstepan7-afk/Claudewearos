package lb;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ej.a {
    public final /* synthetic */ f1.a1 A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10365a = 3;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.q2 f10369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10370f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10371z;

    public /* synthetic */ j(Context context, String str, ej.a aVar, f1.a1 a1Var, f1.f1 f1Var, f1.a1 a1Var2, f1.a1 a1Var3) {
        this.f10368d = context;
        this.f10371z = str;
        this.f10370f = aVar;
        this.f10369e = a1Var;
        this.A = f1Var;
        this.f10366b = a1Var2;
        this.f10367c = a1Var3;
    }

    @Override // ej.a
    public final Object a() throws IOException {
        Bitmap bitmapCopy;
        String str;
        switch (this.f10365a) {
            case 0:
                g gVar = (g) this.f10368d;
                ej.a aVar = (ej.a) this.f10370f;
                ej.a aVar2 = (ej.a) this.f10371z;
                f1.a1 a1Var = (f1.a1) this.f10369e;
                f1.g1 g1Var = (f1.g1) this.A;
                boolean zBooleanValue = ((Boolean) this.f10366b.getValue()).booleanValue();
                SharedPreferences sharedPreferences = gVar.f10289a;
                sharedPreferences.edit().putBoolean("dont_show_text", zBooleanValue).apply();
                sharedPreferences.edit().putBoolean("fill_cells_of_uninstalled_apps", ((Boolean) this.f10367c.getValue()).booleanValue()).apply();
                sharedPreferences.edit().putBoolean("lock_home_screen_layout", ((Boolean) a1Var.getValue()).booleanValue()).apply();
                gVar.t(g1Var.g());
                aVar.a();
                aVar2.a();
                break;
            case 1:
                qj.z zVar = (qj.z) this.f10370f;
                Context context = (Context) this.f10371z;
                g gVar2 = (g) this.f10368d;
                f1.a1 a1Var2 = (f1.a1) this.f10369e;
                f1.a1 a1Var3 = this.f10366b;
                q3.E(a1Var3, true);
                f1.a1 a1Var4 = this.f10367c;
                a1Var4.setValue(null);
                qj.b0.w(zVar, null, new androidx.lifecycle.j0(context, gVar2, a1Var2, this.A, a1Var4, a1Var3, null, 1), 3);
                break;
            case 2:
                qj.z zVar2 = (qj.z) this.f10368d;
                Context context2 = (Context) this.f10370f;
                f1.a1 a1Var5 = (f1.a1) this.f10369e;
                f1.a1 a1Var6 = (f1.a1) this.f10371z;
                f1.f1 f1Var = (f1.f1) this.A;
                Boolean bool = Boolean.FALSE;
                f1.a1 a1Var7 = this.f10366b;
                a1Var7.setValue(bool);
                qj.b0.w(zVar2, null, new androidx.lifecycle.j0(context2, this.f10367c, a1Var5, a1Var6, f1Var, a1Var7, null, 2), 3);
                break;
            default:
                Context context3 = (Context) this.f10368d;
                String str2 = (String) this.f10371z;
                ej.a aVar3 = (ej.a) this.f10370f;
                f1.f1 f1Var2 = (f1.f1) this.A;
                Bitmap bitmap = (Bitmap) this.f10369e.getValue();
                if (bitmap != null) {
                    if (f1Var2.g() > 0.0f) {
                        bitmapCopy = mb.a.m(bitmap, cg.b.p(hj.a.H(f1Var2.g()), 1, 50));
                    } else {
                        Bitmap.Config config = bitmap.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmapCopy = bitmap.copy(config, false);
                    }
                    fj.l.c(bitmapCopy);
                    float fG = f1Var2.g();
                    boolean zBooleanValue2 = ((Boolean) this.f10366b.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) this.f10367c.getValue()).booleanValue();
                    fj.l.f(context3, "context");
                    File file = new File(context3.getFilesDir(), "wallpapers");
                    file.mkdirs();
                    LinkedHashMap linkedHashMapN0 = qi.v.n0(mb.a.p(context3));
                    mb.c cVar = (mb.c) linkedHashMapN0.get(str2);
                    if (cVar == null || cVar.f11442b != fG) {
                        String str3 = "custom_" + System.currentTimeMillis() + "_" + UUID.randomUUID() + ".jpg";
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str3));
                        try {
                            bitmapCopy.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
                            fileOutputStream.close();
                            if (cVar != null) {
                                String str4 = cVar.f11441a;
                                if (!fj.l.b(str4, str3)) {
                                    try {
                                        new File(file, str4).delete();
                                    } catch (Throwable th2) {
                                        uk.c.r(th2);
                                    }
                                }
                            }
                            str = str3;
                        } finally {
                        }
                    } else {
                        str = cVar.f11441a;
                    }
                    linkedHashMapN0.put(str2, new mb.c(str, fG, zBooleanValue2, zBooleanValue3));
                    mb.a.q(context3, linkedHashMapN0);
                    SharedPreferences sharedPreferences2 = context3.getSharedPreferences("home_launcher_settings", 0);
                    fj.l.e(sharedPreferences2, "getSharedPreferences(...)");
                    sharedPreferences2.edit().putInt("wallpaper_customization_version", sharedPreferences2.getInt("wallpaper_customization_version", 0) + 1).apply();
                    aVar3.a();
                }
                return pi.o.f13011a;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ j(g gVar, ej.a aVar, ej.a aVar2, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f1.g1 g1Var) {
        this.f10368d = gVar;
        this.f10370f = aVar;
        this.f10371z = aVar2;
        this.f10366b = a1Var;
        this.f10367c = a1Var2;
        this.f10369e = a1Var3;
        this.A = g1Var;
    }

    public /* synthetic */ j(qj.z zVar, f1.a1 a1Var, Context context, f1.a1 a1Var2, f1.a1 a1Var3, f1.a1 a1Var4, f1.f1 f1Var) {
        this.f10368d = zVar;
        this.f10366b = a1Var;
        this.f10370f = context;
        this.f10367c = a1Var2;
        this.f10369e = a1Var3;
        this.f10371z = a1Var4;
        this.A = f1Var;
    }

    public /* synthetic */ j(qj.z zVar, f1.a1 a1Var, f1.a1 a1Var2, Context context, g gVar, f1.a1 a1Var3, f1.a1 a1Var4) {
        this.f10370f = zVar;
        this.f10366b = a1Var;
        this.f10367c = a1Var2;
        this.f10371z = context;
        this.f10368d = gVar;
        this.f10369e = a1Var3;
        this.A = a1Var4;
    }
}
