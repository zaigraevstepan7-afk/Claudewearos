package je;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z;
import ig.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends od.a {
    public static final Parcelable.Creator<f> CREATOR = new e0(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f8864a;

    /* renamed from: b, reason: collision with root package name */
    public final z f8865b;

    public f(int i10, z zVar) {
        this.f8864a = i10;
        this.f8865b = zVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f8864a);
        uk.c.b0(parcel, 2, this.f8865b, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
