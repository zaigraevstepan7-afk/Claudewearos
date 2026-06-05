package yd;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends zza {
    public final xd.a n(xd.b bVar, String str, int i10, xd.b bVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        zzc.zze(parcelZza, bVar2);
        return gk.b.r(zzB(2, parcelZza));
    }

    public final xd.a u(xd.b bVar, String str, int i10, xd.b bVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        zzc.zze(parcelZza, bVar2);
        return gk.b.r(zzB(3, parcelZza));
    }
}
