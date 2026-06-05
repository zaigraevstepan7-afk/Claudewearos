package md;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends od.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final Intent f11600a;

    public a(Intent intent) {
        this.f11600a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f11600a, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
