package hd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends od.a {
    public static final Parcelable.Creator<m> CREATOR = new gd.g(15);

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f7876a;

    public m(PendingIntent pendingIntent) {
        e0.i(pendingIntent);
        this.f7876a = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return e0.l(this.f7876a, ((m) obj).f7876a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7876a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 1, this.f7876a, i10, false);
        uk.c.j0(iH0, parcel);
    }
}
