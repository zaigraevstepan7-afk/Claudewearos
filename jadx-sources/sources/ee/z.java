package ee;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z extends od.a {
    public static final Parcelable.Creator<z> CREATOR = new dd.d(19);

    /* renamed from: a, reason: collision with root package name */
    public final zzbs f5968a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f5969b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5970c;

    public z(List list, PendingIntent pendingIntent, String str) {
        this.f5968a = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.f5969b = pendingIntent;
        this.f5970c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.e0(parcel, 1, this.f5968a);
        uk.c.b0(parcel, 2, this.f5969b, i10, false);
        uk.c.c0(parcel, 3, this.f5970c, false);
        uk.c.j0(iH0, parcel);
    }
}
