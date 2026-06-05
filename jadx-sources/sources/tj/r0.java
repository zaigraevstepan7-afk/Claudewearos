package tj;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r0 extends uj.b implements b0, e, uj.l {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16437f = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f16438e;

    public r0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // uj.l
    public final e a(ti.h hVar, int i10, sj.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != sj.a.f15040b) ? i0.l(this, hVar, i10, aVar) : this;
    }

    @Override // tj.f
    public final Object b(Object obj, ti.c cVar) {
        j(obj);
        return pi.o.f13011a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:58:0x00f8, B:59:0x00f9], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00e0, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    @Override // tj.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tj.f r18, ti.c r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.r0.c(tj.f, ti.c):java.lang.Object");
    }

    @Override // uj.b
    public final uj.d e() {
        return new s0();
    }

    @Override // uj.b
    public final uj.d[] f() {
        return new s0[2];
    }

    @Override // tj.p0
    public final Object getValue() {
        d7.c cVar = uj.c.f17101b;
        Object obj = f16437f.get(this);
        if (obj == cVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        d7.c cVar = uj.c.f17101b;
        if (obj == null) {
            obj = cVar;
        }
        if (obj2 == null) {
            obj2 = cVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = uj.c.f17101b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i10;
        uj.d[] dVarArr;
        d7.c cVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16437f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !fj.l.b(obj3, obj)) {
                return false;
            }
            if (fj.l.b(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f16438e;
            if ((i11 & 1) != 0) {
                this.f16438e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f16438e = i12;
            uj.d[] dVarArr2 = this.f17096a;
            while (true) {
                s0[] s0VarArr = (s0[]) dVarArr2;
                if (s0VarArr != null) {
                    for (s0 s0Var : s0VarArr) {
                        if (s0Var != null) {
                            AtomicReference atomicReference = s0Var.f16443a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (cVar = i0.f16382c)) {
                                    d7.c cVar2 = i0.f16381b;
                                    if (obj4 != cVar2) {
                                        while (!atomicReference.compareAndSet(obj4, cVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((qj.l) obj4).resumeWith(pi.o.f13011a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, cVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f16438e;
                    if (i10 == i12) {
                        this.f16438e = i12 + 1;
                        return true;
                    }
                    dVarArr = this.f17096a;
                }
                dVarArr2 = dVarArr;
                i12 = i10;
            }
        }
    }
}
