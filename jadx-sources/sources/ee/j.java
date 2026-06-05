package ee;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends od.a implements com.google.android.gms.common.api.t {
    public static final Parcelable.Creator<j> CREATOR = new dd.d(16);

    /* renamed from: a, reason: collision with root package name */
    public final Status f5951a;

    /* renamed from: b, reason: collision with root package name */
    public final k f5952b;

    public j(Status status, k kVar) {
        this.f5951a = status;
        this.f5952b = kVar;
    }

    @Override // com.google.android.gms.common.api.t
    public final Status getStatus() {
        return this.f5951a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f5951a, i10, false);
        uk.c.b0(parcel, 2, this.f5952b, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
