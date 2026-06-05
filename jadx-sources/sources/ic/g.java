package ic;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import nc.a1;
import nc.b1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends od.a {
    public static final Parcelable.Creator<g> CREATOR = new gd.g(19);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f8503b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f8504c;

    public g(boolean z2, IBinder iBinder, IBinder iBinder2) {
        this.f8502a = z2;
        this.f8503b = iBinder != null ? a1.zzd(iBinder) : null;
        this.f8504c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f8502a ? 1 : 0);
        b1 b1Var = this.f8503b;
        uk.c.X(parcel, 2, b1Var == null ? null : b1Var.asBinder());
        uk.c.X(parcel, 3, this.f8504c);
        uk.c.j0(iH0, parcel);
    }
}
