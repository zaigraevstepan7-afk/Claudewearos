package je;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a0;
import ig.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends od.a {
    public static final Parcelable.Creator<g> CREATOR = new e0(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f8866a;

    /* renamed from: b, reason: collision with root package name */
    public final nd.b f8867b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f8868c;

    public g(int i10, nd.b bVar, a0 a0Var) {
        this.f8866a = i10;
        this.f8867b = bVar;
        this.f8868c = a0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f8866a);
        uk.c.b0(parcel, 2, this.f8867b, i10, false);
        uk.c.b0(parcel, 3, this.f8868c, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
