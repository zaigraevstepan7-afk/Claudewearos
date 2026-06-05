package qc;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends zzayr implements a0 {
    @Override // qc.a0
    public final void zze(xd.a aVar) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzdb(2, parcelZza);
    }

    @Override // qc.a0
    public final boolean zzf(xd.a aVar, String str, String str2) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        Parcel parcelZzda = zzda(1, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }

    @Override // qc.a0
    public final boolean zzg(xd.a aVar, oc.a aVar2) {
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzd(parcelZza, aVar2);
        Parcel parcelZzda = zzda(3, parcelZza);
        boolean zZzg = zzayt.zzg(parcelZzda);
        parcelZzda.recycle();
        return zZzg;
    }
}
