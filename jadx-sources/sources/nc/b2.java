package nc;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;
import com.google.android.gms.internal.ads.zzayt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b2 extends zzayr implements d2 {
    public b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // nc.d2
    public final void zze(String str, xd.a aVar, xd.a aVar2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayt.zzf(parcelZza, aVar);
        zzayt.zzf(parcelZza, aVar2);
        zzdb(1, parcelZza);
    }
}
