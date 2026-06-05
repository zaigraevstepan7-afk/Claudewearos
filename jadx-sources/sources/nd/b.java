package nd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbch;
import ig.e0;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends od.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12267a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12268b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f12269c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12270d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f12266e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new e0(26);

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f12267a = i10;
        this.f12268b = i11;
        this.f12269c = pendingIntent;
        this.f12270d = str;
    }

    public static String b(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case zzbch.zzt.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return m6.a.e(i10, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12268b == bVar.f12268b && com.google.android.gms.common.internal.e0.l(this.f12269c, bVar.f12269c) && com.google.android.gms.common.internal.e0.l(this.f12270d, bVar.f12270d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12268b), this.f12269c, this.f12270d});
    }

    public final String toString() {
        t0.j jVar = new t0.j(this);
        jVar.g(b(this.f12268b), "statusCode");
        jVar.g(this.f12269c, "resolution");
        jVar.g(this.f12270d, "message");
        return jVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f12267a);
        uk.c.k0(parcel, 2, 4);
        parcel.writeInt(this.f12268b);
        uk.c.b0(parcel, 3, this.f12269c, i10, false);
        uk.c.c0(parcel, 4, this.f12270d, false);
        uk.c.j0(iH0, parcel);
    }

    public b(int i10) {
        this(1, i10, null, null);
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
