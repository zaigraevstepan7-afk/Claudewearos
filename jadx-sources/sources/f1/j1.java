package f1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j1 extends t1.b0 implements Parcelable, t1.o {
    public static final Parcelable.Creator<j1> CREATOR = new i1();

    /* renamed from: b, reason: collision with root package name */
    public final n2 f6352b;

    /* renamed from: c, reason: collision with root package name */
    public m2 f6353c;

    public j1(Object obj, n2 n2Var) {
        this.f6352b = n2Var;
        t1.g gVarJ = t1.m.j();
        m2 m2Var = new m2(gVarJ.g(), obj);
        if (!(gVarJ instanceof t1.a)) {
            m2Var.f15420b = new m2(1, obj);
        }
        this.f6353c = m2Var;
    }

    @Override // t1.a0
    public final t1.c0 b() {
        return this.f6353c;
    }

    @Override // t1.o
    public final n2 c() {
        return this.f6352b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // t1.a0
    public final void e(t1.c0 c0Var) {
        fj.l.d(c0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f6353c = (m2) c0Var;
    }

    @Override // f1.q2
    public final Object getValue() {
        return ((m2) t1.m.t(this.f6353c, this)).f6394c;
    }

    @Override // t1.a0
    public final t1.c0 i(t1.c0 c0Var, t1.c0 c0Var2, t1.c0 c0Var3) {
        if (this.f6352b.a(((m2) c0Var2).f6394c, ((m2) c0Var3).f6394c)) {
            return c0Var2;
        }
        return null;
    }

    @Override // f1.a1
    public final void setValue(Object obj) {
        t1.g gVarJ;
        m2 m2Var = (m2) t1.m.h(this.f6353c);
        if (this.f6352b.a(m2Var.f6394c, obj)) {
            return;
        }
        m2 m2Var2 = this.f6353c;
        synchronized (t1.m.f15471c) {
            gVarJ = t1.m.j();
            ((m2) t1.m.o(m2Var2, this, gVarJ, m2Var)).f6394c = obj;
        }
        t1.m.n(gVarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((m2) t1.m.h(this.f6353c)).f6394c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        f fVar = f.f6290d;
        n2 n2Var = this.f6352b;
        if (fj.l.b(n2Var, fVar)) {
            i11 = 0;
        } else if (fj.l.b(n2Var, f.f6293z)) {
            i11 = 1;
        } else {
            if (!fj.l.b(n2Var, f.f6291e)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
