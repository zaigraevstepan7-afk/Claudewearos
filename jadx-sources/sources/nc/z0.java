package nc;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayr;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 extends zzayr implements b1 {
    public z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // nc.b1
    public final void zzc(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdb(1, parcelZza);
    }
}
