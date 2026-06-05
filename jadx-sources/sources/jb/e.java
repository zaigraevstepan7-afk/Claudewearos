package jb;

import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import c2.e0;
import c2.w;
import c2.z0;
import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import com.google.android.gms.internal.ads.zzbch;
import f1.r2;
import f1.v;
import java.io.File;
import java.util.LinkedHashMap;
import k0.q;
import kk.k;
import kk.t;
import lb.q3;
import lb.r;
import mi.s;
import pi.o;
import s3.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8820a;

    public /* synthetic */ e(int i10) {
        this.f8820a = i10;
    }

    @Override // ej.a
    public final Object a() {
        int i10 = this.f8820a;
        o oVar = o.f13011a;
        switch (i10) {
            case 0:
                throw new IllegalStateException("No home screen mode provided");
            case 1:
                throw new IllegalStateException("No overlaying haze state provided");
            case 2:
                v vVar = f.f8821a;
                return Float.valueOf(45.0f);
            case 3:
                v vVar2 = f.f8821a;
                return Boolean.FALSE;
            case 4:
                return lb.b.f10142b;
            case 5:
                return new d(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, false, 0.0f, 0.0f, 0.0f, false, 0.0f, 32767);
            case 6:
                return new z0(e0.c(1308617531));
            case 7:
                r2 r2Var = q.f9236a;
                return null;
            case 8:
                return new j(0L);
            case 9:
                return new j(0L);
            case 10:
                v vVar3 = k6.a.f9455a;
                return null;
            case 11:
                kk.q qVar = k.f9707a;
                t tVarF = k.f9708b.f("coil3_disk_cache");
                long jQ = 10485760;
                try {
                    File file = tVarF.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jQ = cg.b.q((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                l8.c cVar = new l8.c();
                new l8.b(qVar, tVarF, jQ);
                return cVar;
            case 12:
                int i11 = r.f10610g;
                return oVar;
            case 13:
                float f10 = q3.f10603g;
                return oVar;
            case 14:
                float f11 = q3.f10603g;
                return 0;
            case 15:
                return new mi.c();
            case 16:
                return new q.r(50);
            case 17:
                float f12 = mi.e.f11753a;
                long j = w.f3058h;
                return new mi.q(j, new s(j != 16 ? w.c(j, w.e(j) * 0.7f) : j), mi.e.f11753a, 16);
            case 18:
                ga.c cVar2 = nb.e.f11994g;
                return oVar;
            case 19:
                float f13 = nb.v.j;
                return oVar;
            case 20:
                ak.v vVar4 = rk.a.f14558b;
                if (vVar4 != null) {
                    return new pk.a(vVar4, new e(23));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case zzbch.zzt.zzm /* 21 */:
                ak.v vVar5 = rk.a.f14558b;
                if (vVar5 != null) {
                    return new pk.a(((al.a) vVar5.f732c).f768d, new e(22));
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 22:
                ak.v vVar6 = rk.a.f14558b;
                if (vVar6 != null) {
                    return ((al.a) vVar6.f732c).f768d;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 23:
                ak.v vVar7 = rk.a.f14558b;
                if (vVar7 != null) {
                    return vVar7;
                }
                throw new IllegalStateException("KoinApplication has not been started");
            case 24:
                r2 r2Var2 = q1.b.f13175a;
                return q1.a.f13174a;
            case 25:
                return new Handler(Looper.getMainLooper());
            case 26:
                v vVar8 = r0.g.f13662a;
                return null;
            case 27:
                int i12 = HomeActivity.N;
                return oVar;
            case 28:
                return ki.a.f9650a;
            default:
                return new s1.c(new LinkedHashMap());
        }
    }
}
