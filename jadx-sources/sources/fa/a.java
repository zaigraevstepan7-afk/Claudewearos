package fa;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import c2.w;
import com.google.android.gms.internal.ads.zzbch;
import f1.r2;
import f1.v;
import ha.c;
import ha.g;
import i8.m;
import i8.r;
import ij.d;
import java.lang.reflect.Method;
import jb.h;
import ji.f;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6653a;

    public /* synthetic */ a(int i10) {
        this.f6653a = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pi.e] */
    @Override // ej.a
    public final Object a() {
        Class<?> returnType;
        int i10 = this.f6653a;
        o oVar = o.f13011a;
        switch (i10) {
            case 0:
                throw new IllegalStateException("ScreenType LocalProvider not provided");
            case 1:
                throw new IllegalStateException("No OverlayManager provided");
            case 2:
                return ii.a.f8577g;
            case 3:
                return a.a.c(32.0f);
            case 4:
                return ii.a.f8577g;
            case 5:
                return ii.a.f8575e;
            case 6:
                return f.f8972f;
            case 7:
                ij.a aVar = d.f8598a;
                return Integer.valueOf(d.f8598a.a().nextInt(2147418112) + 65536);
            case 8:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 9:
                try {
                    Method method = (Method) g7.b.f7225c.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 10:
                r2 r2Var = gb.a.f7269a;
                return oVar;
            case 11:
                return new a(12);
            case 12:
                r2 r2Var2 = gb.a.f7269a;
                return Float.valueOf(1.0f);
            case 13:
                return ki.a.f9650a;
            case 14:
                return ki.a.f9650a;
            case 15:
                return ki.a.f9650a;
            case 16:
                return ki.a.f9650a;
            case 17:
                return new f(0.0f, 26, w.c(w.f3052b, 0.05f));
            case 18:
                return c.f7766a;
            case 19:
                return g.f7774a;
            case 20:
                r2 r2Var3 = r.f8400a;
                return i8.b.f8373a;
            case zzbch.zzt.zzm /* 21 */:
                return m.f8390a;
            case 22:
                v vVar = jb.c.f8800a;
                return Float.valueOf(0.0f);
            case 23:
                v vVar2 = jb.c.f8800a;
                return Float.valueOf(1.0f);
            case 24:
                return h.f8837b;
            case 25:
                v vVar3 = jb.c.f8800a;
                return Boolean.FALSE;
            case 26:
                return new a(27);
            case 27:
                v vVar4 = jb.c.f8800a;
                return oVar;
            case 28:
                throw new IllegalStateException("No grid unit size provided");
            default:
                v vVar5 = jb.f.f8821a;
                return null;
        }
    }
}
