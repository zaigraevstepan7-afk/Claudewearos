package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h1 extends t1.b0 implements Parcelable, t1.o, a1, q2 {
    public static final Parcelable.Creator<h1> CREATOR = new e1(2);

    /* renamed from: b, reason: collision with root package name */
    public l2 f6312b;

    public h1(long j) {
        t1.g gVarJ = t1.m.j();
        l2 l2Var = new l2(gVarJ.g(), j);
        if (!(gVarJ instanceof t1.a)) {
            l2Var.f15420b = new l2(1, j);
        }
        this.f6312b = l2Var;
    }

    @Override // t1.a0
    public final t1.c0 b() {
        return this.f6312b;
    }

    @Override // t1.o
    public final n2 c() {
        return f.f6293z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // t1.a0
    public final void e(t1.c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f6312b = (l2) c0Var;
    }

    public final long g() {
        return ((l2) t1.m.t(this.f6312b, this)).f6384c;
    }

    @Override // f1.q2
    public Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        t1.g gVarJ;
        l2 l2Var = (l2) t1.m.h(this.f6312b);
        if (l2Var.f6384c != j) {
            l2 l2Var2 = this.f6312b;
            synchronized (t1.m.f15471c) {
                gVarJ = t1.m.j();
                ((l2) t1.m.o(l2Var2, this, gVarJ, l2Var)).f6384c = j;
            }
            t1.m.n(gVarJ, this);
        }
    }

    @Override // t1.a0
    public final t1.c0 i(t1.c0 c0Var, t1.c0 c0Var2, t1.c0 c0Var3) {
        if (((l2) c0Var2).f6384c == ((l2) c0Var3).f6384c) {
            return c0Var2;
        }
        return null;
    }

    @Override // f1.a1
    public void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((l2) t1.m.h(this.f6312b)).f6384c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(g());
    }
}
