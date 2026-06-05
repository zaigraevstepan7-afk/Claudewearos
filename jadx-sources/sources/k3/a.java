package k3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import f0.a1;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements r5.j, f7.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9352a;

    public /* synthetic */ a(Context context, byte b10) {
        this.f9352a = context;
    }

    @Override // r5.j
    public void a(uk.c cVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new r5.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new p0.g(this, cVar, threadPoolExecutor, 1));
    }

    public ApplicationInfo b(int i10, String str) {
        return this.f9352a.getPackageManager().getApplicationInfo(str, i10);
    }

    public CharSequence c(String str) {
        Context context = this.f9352a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(int i10, String str) {
        return this.f9352a.getPackageManager().getPackageInfo(str, i10);
    }

    @Override // f7.d
    public f7.e e(a1 a1Var) {
        String str = (String) a1Var.f6106c;
        f7.c cVar = (f7.c) a1Var.f6107d;
        fj.l.f(cVar, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        a1 a1Var2 = new a1(this.f9352a, str, cVar, true);
        return new g7.g((Context) a1Var2.f6105b, (String) a1Var2.f6106c, (f7.c) a1Var2.f6107d, a1Var2.f6104a);
    }

    public boolean f() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f9352a;
        if (callingUid == iMyUid) {
            return wd.a.H(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public Typeface g(y yVar) {
        String strA;
        if (!(yVar instanceof y)) {
            return null;
        }
        int i10 = yVar.f9406a;
        Context context = this.f9352a;
        Typeface typefaceA = k4.l.a(context, i10);
        fj.l.c(typefaceA);
        List list = yVar.f9408c.f9394a;
        int i11 = Build.VERSION.SDK_INT;
        ThreadLocal threadLocal = a0.f9353a;
        if (typefaceA == null) {
            return null;
        }
        if (list.isEmpty()) {
            return typefaceA;
        }
        ThreadLocal threadLocal2 = a0.f9353a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typefaceA);
        s3.e eVarB = u6.v.b(context);
        int i12 = (i11 < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i12 == 0) {
            strA = u3.b.a(list, null, new g3.y(eVarB), 31);
        } else {
            if (list.size() > 0) {
                list.get(0).getClass();
                throw new ClassCastException();
            }
            float fO = cg.b.o(i12 + 400.0f, 1.0f, 1000.0f);
            strA = (!list.isEmpty() ? "," : "") + "'wght' " + fO;
        }
        paint.setFontVariationSettings(strA);
        return paint.getTypeface();
    }

    public a(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f9352a = context.getApplicationContext();
                break;
            default:
                this.f9352a = context.getApplicationContext();
                break;
        }
    }
}
