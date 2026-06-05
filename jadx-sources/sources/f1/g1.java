package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g1 extends t1.b0 implements Parcelable, t1.o, a1, q2 {
    public static final Parcelable.Creator<g1> CREATOR = new e1(1);

    /* renamed from: b, reason: collision with root package name */
    public k2 f6308b;

    public g1(int i10) {
        t1.g gVarJ = t1.m.j();
        k2 k2Var = new k2(gVarJ.g(), i10);
        if (!(gVarJ instanceof t1.a)) {
            k2Var.f15420b = new k2(1, i10);
        }
        this.f6308b = k2Var;
    }

    @Override // t1.a0
    public final t1.c0 b() {
        return this.f6308b;
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
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f6308b = (k2) c0Var;
    }

    public final int g() {
        return ((k2) t1.m.t(this.f6308b, this)).f6369c;
    }

    @Override // f1.q2
    public Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i10) {
        t1.g gVarJ;
        k2 k2Var = (k2) t1.m.h(this.f6308b);
        if (k2Var.f6369c != i10) {
            k2 k2Var2 = this.f6308b;
            synchronized (t1.m.f15471c) {
                gVarJ = t1.m.j();
                ((k2) t1.m.o(k2Var2, this, gVarJ, k2Var)).f6369c = i10;
            }
            t1.m.n(gVarJ, this);
        }
    }

    @Override // t1.a0
    public final t1.c0 i(t1.c0 c0Var, t1.c0 c0Var2, t1.c0 c0Var3) {
        if (((k2) c0Var2).f6369c == ((k2) c0Var3).f6369c) {
            return c0Var2;
        }
        return null;
    }

    @Override // f1.a1
    public void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((k2) t1.m.h(this.f6308b)).f6369c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(g());
    }
}
