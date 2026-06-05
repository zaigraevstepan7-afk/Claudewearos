package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f1 extends t1.b0 implements Parcelable, t1.o, a1, q2 {
    public static final Parcelable.Creator<f1> CREATOR = new e1(0);

    /* renamed from: b, reason: collision with root package name */
    public j2 f6296b;

    public f1(float f10) {
        t1.g gVarJ = t1.m.j();
        j2 j2Var = new j2(gVarJ.g(), f10);
        if (!(gVarJ instanceof t1.a)) {
            j2Var.f15420b = new j2(1, f10);
        }
        this.f6296b = j2Var;
    }

    @Override // t1.a0
    public final t1.c0 b() {
        return this.f6296b;
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
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f6296b = (j2) c0Var;
    }

    public final float g() {
        return ((j2) t1.m.t(this.f6296b, this)).f6354c;
    }

    @Override // f1.q2
    public Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f10) {
        t1.g gVarJ;
        j2 j2Var = (j2) t1.m.h(this.f6296b);
        if (j2Var.f6354c == f10) {
            return;
        }
        j2 j2Var2 = this.f6296b;
        synchronized (t1.m.f15471c) {
            gVarJ = t1.m.j();
            ((j2) t1.m.o(j2Var2, this, gVarJ, j2Var)).f6354c = f10;
        }
        t1.m.n(gVarJ, this);
    }

    @Override // t1.a0
    public final t1.c0 i(t1.c0 c0Var, t1.c0 c0Var2, t1.c0 c0Var3) {
        if (((j2) c0Var2).f6354c == ((j2) c0Var3).f6354c) {
            return c0Var2;
        }
        return null;
    }

    @Override // f1.a1
    public void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((j2) t1.m.h(this.f6296b)).f6354c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(g());
    }
}
