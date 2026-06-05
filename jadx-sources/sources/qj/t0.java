package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class t0 implements Runnable, Comparable, o0 {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f13623a;

    /* renamed from: b, reason: collision with root package name */
    public int f13624b = -1;

    public t0(long j) {
        this.f13623a = j;
    }

    @Override // qj.o0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                d7.c cVar = b0.f13549b;
                if (obj == cVar) {
                    return;
                }
                u0 u0Var = obj instanceof u0 ? (u0) obj : null;
                if (u0Var != null) {
                    synchronized (u0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof vj.w ? (vj.w) obj2 : null) != null) {
                            u0Var.b(this.f13624b);
                        }
                    }
                }
                this._heap = cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int b(long j, u0 u0Var, v0 v0Var) {
        synchronized (this) {
            if (this._heap == b0.f13549b) {
                return 2;
            }
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.f18129a;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (v0.B.get(v0Var) == 1) {
                        return 1;
                    }
                    if (t0Var == null) {
                        u0Var.f13627c = j;
                    } else {
                        long j4 = t0Var.f13623a;
                        if (j4 - j < 0) {
                            j = j4;
                        }
                        if (j - u0Var.f13627c > 0) {
                            u0Var.f13627c = j;
                        }
                    }
                    long j10 = this.f13623a;
                    long j11 = u0Var.f13627c;
                    if (j10 - j11 < 0) {
                        this.f13623a = j11;
                    }
                    u0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f13623a - ((t0) obj).f13623a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void f(u0 u0Var) {
        if (this._heap == b0.f13549b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = u0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f13623a + ']';
    }
}
