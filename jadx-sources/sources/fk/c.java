package fk;

import ak.n;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public final n f6815d;

    /* renamed from: e, reason: collision with root package name */
    public long f6816e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6817f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g f6818z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, n nVar) {
        super(gVar);
        this.f6818z = gVar;
        this.f6816e = -1L;
        this.f6817f = true;
        this.f6815d = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r9.f6817f == false) goto L30;
     */
    @Override // fk.a, kk.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A(long r10, kk.f r12) throws java.lang.InterruptedException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r9 = this;
            fk.g r0 = r9.f6818z
            java.lang.Object r1 = r0.f6829e
            kk.h r1 = (kk.h) r1
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 < 0) goto Lc3
            boolean r4 = r9.f6810b
            if (r4 != 0) goto Lbb
            boolean r4 = r9.f6817f
            r5 = -1
            if (r4 != 0) goto L17
            goto L6e
        L17:
            long r7 = r9.f6816e
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L6f
        L21:
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L2a
            r1.S()
        L2a:
            long r7 = r1.c0()     // Catch: java.lang.NumberFormatException -> L4d
            r9.f6816e = r7     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.String r1 = r1.S()     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.String r1 = r1.trim()     // Catch: java.lang.NumberFormatException -> L4d
            long r7 = r9.f6816e     // Catch: java.lang.NumberFormatException -> L4d
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L95
            boolean r7 = r1.isEmpty()     // Catch: java.lang.NumberFormatException -> L4d
            if (r7 != 0) goto L4f
            java.lang.String r7 = ";"
            boolean r7 = r1.startsWith(r7)     // Catch: java.lang.NumberFormatException -> L4d
            if (r7 == 0) goto L95
            goto L4f
        L4d:
            r10 = move-exception
            goto Lb1
        L4f:
            long r7 = r9.f6816e
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 != 0) goto L6a
            r1 = 0
            r9.f6817f = r1
            ak.l r1 = r0.q()
            java.lang.Object r2 = r0.f6827c
            ak.r r2 = (ak.r) r2
            ak.j r2 = r2.A
            ak.n r3 = r9.f6815d
            ek.d.d(r2, r3, r1)
            r9.b()
        L6a:
            boolean r1 = r9.f6817f
            if (r1 != 0) goto L6f
        L6e:
            return r5
        L6f:
            long r1 = r9.f6816e
            long r10 = java.lang.Math.min(r10, r1)
            long r10 = super.A(r10, r12)
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L83
            long r0 = r9.f6816e
            long r0 = r0 - r10
            r9.f6816e = r0
            return r10
        L83:
            java.lang.Object r10 = r0.f6828d
            dk.e r10 = (dk.e) r10
            r10.h()
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "unexpected end of stream"
            r10.<init>(r11)
            r9.b()
            throw r10
        L95:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L4d
            r11.<init>(r4)     // Catch: java.lang.NumberFormatException -> L4d
            long r2 = r9.f6816e     // Catch: java.lang.NumberFormatException -> L4d
            r11.append(r2)     // Catch: java.lang.NumberFormatException -> L4d
            r11.append(r1)     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.String r12 = "\""
            r11.append(r12)     // Catch: java.lang.NumberFormatException -> L4d
            java.lang.String r11 = r11.toString()     // Catch: java.lang.NumberFormatException -> L4d
            r10.<init>(r11)     // Catch: java.lang.NumberFormatException -> L4d
            throw r10     // Catch: java.lang.NumberFormatException -> L4d
        Lb1:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r10 = r10.getMessage()
            r11.<init>(r10)
            throw r11
        Lbb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            r10.<init>(r11)
            throw r10
        Lc3:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r10 = t.m1.g(r10, r0)
            r12.<init>(r10)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.c.A(long, kk.f):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zO;
        if (this.f6810b) {
            return;
        }
        if (this.f6817f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zO = bk.d.o(this, 100);
            } catch (IOException unused) {
                zO = false;
            }
            if (!zO) {
                ((dk.e) this.f6818z.f6828d).h();
                b();
            }
        }
        this.f6810b = true;
    }
}
