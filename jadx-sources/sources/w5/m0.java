package w5;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new pc.j(17);
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final String F;
    public final int G;
    public final boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final String f18688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18689b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18690c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18691d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18692e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18693f;

    /* renamed from: z, reason: collision with root package name */
    public final String f18694z;

    public m0(t tVar) {
        this.f18688a = tVar.getClass().getName();
        this.f18689b = tVar.f18761e;
        this.f18690c = tVar.G;
        this.f18691d = tVar.I;
        this.f18692e = tVar.Q;
        this.f18693f = tVar.R;
        this.f18694z = tVar.S;
        this.A = tVar.V;
        this.B = tVar.E;
        this.C = tVar.U;
        this.D = tVar.T;
        this.E = tVar.f18765g0.ordinal();
        this.F = tVar.A;
        this.G = tVar.B;
        this.H = tVar.f18756b0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f18688a);
        sb2.append(" (");
        sb2.append(this.f18689b);
        sb2.append(")}:");
        if (this.f18690c) {
            sb2.append(" fromLayout");
        }
        if (this.f18691d) {
            sb2.append(" dynamicContainer");
        }
        int i10 = this.f18693f;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f18694z;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.A) {
            sb2.append(" retainInstance");
        }
        if (this.B) {
            sb2.append(" removing");
        }
        if (this.C) {
            sb2.append(" detached");
        }
        if (this.D) {
            sb2.append(" hidden");
        }
        String str2 = this.F;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.G);
        }
        if (this.H) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18688a);
        parcel.writeString(this.f18689b);
        parcel.writeInt(this.f18690c ? 1 : 0);
        parcel.writeInt(this.f18691d ? 1 : 0);
        parcel.writeInt(this.f18692e);
        parcel.writeInt(this.f18693f);
        parcel.writeString(this.f18694z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H ? 1 : 0);
    }

    public m0(Parcel parcel) {
        this.f18688a = parcel.readString();
        this.f18689b = parcel.readString();
        this.f18690c = parcel.readInt() != 0;
        this.f18691d = parcel.readInt() != 0;
        this.f18692e = parcel.readInt();
        this.f18693f = parcel.readInt();
        this.f18694z = parcel.readString();
        this.A = parcel.readInt() != 0;
        this.B = parcel.readInt() != 0;
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt();
        this.F = parcel.readString();
        this.G = parcel.readInt();
        this.H = parcel.readInt() != 0;
    }
}
