package dk;

import ac.o;
import ak.c0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f5183g;

    /* renamed from: a, reason: collision with root package name */
    public final int f5184a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5185b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5186c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f5187d;

    /* renamed from: e, reason: collision with root package name */
    public final yh.c f5188e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5189f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = bk.d.f1785a;
        f5183g = new ThreadPoolExecutor(0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new bk.c("OkHttp ConnectionPool", true));
    }

    public f() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f5186c = new o(this, 6);
        this.f5187d = new ArrayDeque();
        this.f5188e = new yh.c(5);
        this.f5184a = 5;
        this.f5185b = timeUnit.toNanos(5L);
    }

    public final void a(c0 c0Var, IOException iOException) {
        if (c0Var.f604b.type() != Proxy.Type.DIRECT) {
            ak.a aVar = c0Var.f603a;
            aVar.f584g.connectFailed(aVar.f578a.l(), c0Var.f604b.address(), iOException);
        }
        yh.c cVar = this.f5188e;
        synchronized (cVar) {
            ((LinkedHashSet) cVar.f20314b).add(c0Var);
        }
    }

    public final int b(e eVar, long j) {
        ArrayList arrayList = eVar.f5181p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                hk.j.f8044a.n(((j) reference).f5200a, "A connection to " + eVar.f5169c.f603a.f578a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i10);
                eVar.f5176k = true;
                if (arrayList.isEmpty()) {
                    eVar.f5182q = j - this.f5185b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0006, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(ak.a r11, dk.k r12, java.util.ArrayList r13, boolean r14) {
        /*
            r10 = this;
            java.util.ArrayDeque r0 = r10.f5187d
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto Lac
            java.lang.Object r1 = r0.next()
            dk.e r1 = (dk.e) r1
            if (r14 == 0) goto L19
            gk.q r3 = r1.f5174h
            if (r3 == 0) goto L6
        L19:
            ak.c0 r3 = r1.f5169c
            java.util.ArrayList r4 = r1.f5181p
            int r5 = r4.size()
            int r6 = r1.f5180o
            if (r5 >= r6) goto L6
            boolean r5 = r1.f5176k
            if (r5 == 0) goto L2a
            goto L6
        L2a:
            ak.j r5 = ak.j.f658c
            ak.a r6 = r3.f603a
            r5.getClass()
            boolean r5 = r6.a(r11)
            ak.n r6 = r11.f578a
            if (r5 != 0) goto L3a
            goto L6
        L3a:
            java.lang.String r5 = r6.f676d
            ak.a r7 = r3.f603a
            ak.n r7 = r7.f578a
            java.lang.String r7 = r7.f676d
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L49
            goto L91
        L49:
            gk.q r5 = r1.f5174h
            if (r5 != 0) goto L4e
            goto L6
        L4e:
            if (r13 == 0) goto L6
            int r5 = r13.size()
        L54:
            if (r2 >= r5) goto L6
            java.lang.Object r7 = r13.get(r2)
            ak.c0 r7 = (ak.c0) r7
            java.net.Proxy r8 = r7.f604b
            java.net.Proxy$Type r8 = r8.type()
            java.net.Proxy$Type r9 = java.net.Proxy.Type.DIRECT
            if (r8 != r9) goto La9
            java.net.Proxy r8 = r3.f604b
            java.net.Proxy$Type r8 = r8.type()
            if (r8 != r9) goto La9
            java.net.InetSocketAddress r8 = r3.f605c
            java.net.InetSocketAddress r7 = r7.f605c
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto La9
            javax.net.ssl.HostnameVerifier r2 = r11.f586i
            jk.c r3 = jk.c.f8988a
            if (r2 == r3) goto L7f
            goto L6
        L7f:
            boolean r2 = r1.j(r6)
            if (r2 != 0) goto L86
            goto L6
        L86:
            ak.d r2 = r11.j     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            java.lang.String r3 = r6.f676d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            ak.k r5 = r1.f5172f     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            java.util.List r5 = r5.f661c     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
            r2.a(r3, r5)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L6
        L91:
            dk.e r11 = r12.f5209i
            if (r11 != 0) goto La3
            r12.f5209i = r1
            dk.j r11 = new dk.j
            java.lang.Object r13 = r12.f5206f
            r11.<init>(r12, r13)
            r4.add(r11)
            r11 = 1
            return r11
        La3:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>()
            throw r11
        La9:
            int r2 = r2 + 1
            goto L54
        Lac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dk.f.c(ak.a, dk.k, java.util.ArrayList, boolean):boolean");
    }
}
