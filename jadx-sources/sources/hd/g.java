package hd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends od.a {
    public static final Parcelable.Creator<g> CREATOR = new gd.g(5);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f7864a;

    public g(PendingIntent pendingIntent) {
        e0.i(pendingIntent);
        this.f7864a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f7864a, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
