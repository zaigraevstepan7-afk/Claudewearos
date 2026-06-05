package h9;

import ag.l;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.internal.play_billing.zzlk;
import java.security.Provider;
import java.security.Signature;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import kk.b;
import kk.t;
import lk.f;
import rb.e;
import uc.d;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class a implements l, z0, v, d, e, yd.d {

    /* renamed from: b, reason: collision with root package name */
    public static a f7739b;

    /* renamed from: c, reason: collision with root package name */
    public static a f7740c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7741a;

    public /* synthetic */ a(int i10) {
        this.f7741a = i10;
    }

    public static final void f(kk.e eVar, long j, boolean z2) {
        kk.e eVar2;
        ReentrantLock reentrantLock = kk.e.f9683h;
        if (kk.e.f9686l == null) {
            kk.e.f9686l = new kk.e();
            b bVar = new b("Okio Watchdog");
            bVar.setDaemon(true);
            bVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z2) {
            eVar.f9689g = Math.min(j, eVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            eVar.f9689g = j + jNanoTime;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            eVar.f9689g = eVar.c();
        }
        long j4 = eVar.f9689g - jNanoTime;
        kk.e eVar3 = kk.e.f9686l;
        fj.l.c(eVar3);
        while (true) {
            eVar2 = eVar3.f9688f;
            if (eVar2 == null || j4 < eVar2.f9689g - jNanoTime) {
                break;
            }
            fj.l.c(eVar2);
            eVar3 = eVar2;
        }
        eVar.f9688f = eVar2;
        eVar3.f9688f = eVar;
        if (eVar3 == kk.e.f9686l) {
            kk.e.f9684i.signal();
        }
    }

    public static final boolean g(t tVar) {
        t tVar2 = f.f11012f;
        return !nj.l.w0(tVar.b(), ".class", true);
    }

    public static kk.e h() throws InterruptedException {
        kk.e eVar = kk.e.f9686l;
        fj.l.c(eVar);
        kk.e eVar2 = eVar.f9688f;
        if (eVar2 == null) {
            long jNanoTime = System.nanoTime();
            kk.e.f9684i.await(kk.e.j, TimeUnit.MILLISECONDS);
            kk.e eVar3 = kk.e.f9686l;
            fj.l.c(eVar3);
            if (eVar3.f9688f != null || System.nanoTime() - jNanoTime < kk.e.f9685k) {
                return null;
            }
            return kk.e.f9686l;
        }
        long jNanoTime2 = eVar2.f9689g - System.nanoTime();
        if (jNanoTime2 > 0) {
            kk.e.f9684i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        kk.e eVar4 = kk.e.f9686l;
        fj.l.c(eVar4);
        eVar4.f9688f = eVar2.f9688f;
        eVar2.f9688f = null;
        eVar2.f9687e = 2;
        return eVar2;
    }

    public static a5.d i(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1567968963) {
                if (iHashCode != -154594663) {
                    if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new a5.f(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new a5.b(str2, 1);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new a5.b(str2, 0);
            }
        }
        return new a5.b(str2, 3);
    }

    public x0 a(Class cls) {
        return c.w(cls);
    }

    @Override // rb.e
    public Object apply(Object obj) {
        return ((zzlk) obj).zzh();
    }

    @Override // ag.l
    public Object b(String str, Provider provider) {
        switch (this.f7741a) {
            case 1:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    public x0 c(Class cls, d6.c cVar) {
        return a(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // yd.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yd.c d(android.content.Context r3, java.lang.String r4, yd.b r5) {
        /*
            r2 = this;
            yd.c r0 = new yd.c
            r0.<init>()
            int r1 = r5.h(r3, r4)
            r0.f20278a = r1
            r1 = 1
            int r3 = r5.e(r3, r4, r1)
            r0.f20279b = r3
            int r4 = r0.f20278a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f20280c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.a.d(android.content.Context, java.lang.String, yd.b):yd.c");
    }

    @Override // androidx.lifecycle.z0
    public x0 e(fj.f fVar, d6.c cVar) {
        return c(cg.b.D(fVar), cVar);
    }
}
