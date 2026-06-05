package xj;

import fj.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final /* synthetic */ c A;

    /* renamed from: a, reason: collision with root package name */
    public final m f20074a;

    /* renamed from: b, reason: collision with root package name */
    public final v f20075b;

    /* renamed from: c, reason: collision with root package name */
    public b f20076c;

    /* renamed from: d, reason: collision with root package name */
    public long f20077d;

    /* renamed from: e, reason: collision with root package name */
    public long f20078e;

    /* renamed from: f, reason: collision with root package name */
    public int f20079f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20080z;

    public a(c cVar, int i10) {
        this.A = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f20074a = new m();
        this.f20075b = new v();
        this.f20076c = b.f20084d;
        this.nextParkedWorker = c.D;
        int iNanoTime = (int) System.nanoTime();
        this.f20079f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = xj.m.f20111d.get(r10);
        r0 = xj.m.f20110c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (xj.m.f20112e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xj.i a(boolean r12) {
        /*
            r11 = this;
            xj.b r0 = r11.f20076c
            xj.b r1 = xj.b.f20081a
            xj.c r3 = r11.A
            r8 = 0
            r9 = 1
            xj.m r10 = r11.f20074a
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = xj.c.B
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L73
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = xj.m.f20109b
            java.lang.Object r0 = r12.get(r10)
            xj.i r0 = (xj.i) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.f20100b
            if (r1 != r9) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r8)
            if (r1 == 0) goto L3a
            r8 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = xj.m.f20111d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = xj.m.f20110c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = xj.m.f20112e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            xj.i r1 = r10.c(r0, r9)
            if (r1 == 0) goto L4d
            r8 = r1
        L61:
            if (r8 != 0) goto L72
            xj.f r12 = r3.f20092f
            java.lang.Object r12 = r12.d()
            xj.i r12 = (xj.i) r12
            if (r12 != 0) goto L71
            xj.i r12 = r11.i(r9)
        L71:
            return r12
        L72:
            return r8
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = xj.c.B
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            xj.b r0 = xj.b.f20081a
            r11.f20076c = r0
        L86:
            if (r12 == 0) goto Lba
            int r12 = r3.f20087a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r9 = 0
        L94:
            if (r9 == 0) goto L9d
            xj.i r12 = r11.e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = xj.m.f20109b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            xj.i r12 = (xj.i) r12
            if (r12 != 0) goto Lae
            xj.i r12 = r10.b()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r9 != 0) goto Lc1
            xj.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            xj.i r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            xj.i r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.a.a(boolean):xj.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f20079f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f20079f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i10;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.A;
        if (iD == 0) {
            i iVar = (i) cVar.f20091e.d();
            return iVar != null ? iVar : (i) cVar.f20092f.d();
        }
        i iVar2 = (i) cVar.f20092f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f20091e.d();
    }

    public final void f(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A.f20090d);
        sb2.append("-worker-");
        sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f20076c;
        boolean z2 = bVar2 == b.f20081a;
        if (z2) {
            c.B.addAndGet(this.A, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f20076c = bVar;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final xj.i i(int r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.a.i(int):xj.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.a.run():void");
    }
}
