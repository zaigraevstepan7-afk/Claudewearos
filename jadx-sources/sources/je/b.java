package je;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import ig.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends od.a implements t {
    public static final Parcelable.Creator<b> CREATOR = new e0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f8859a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8860b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f8861c;

    public b(int i10, int i11, Intent intent) {
        this.f8859a = i10;
        this.f8860b = i11;
        this.f8861c = intent;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f8860b == 0 ? Status.f3488e : Status.B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f8859a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f8860b);
        uk.c.b0(parcel, 3, this.f8861c, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
