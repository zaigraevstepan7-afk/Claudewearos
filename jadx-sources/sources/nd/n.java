package nd;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n extends zzb implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12295a;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        e0.b(bArr.length == 25);
        this.f12295a = Arrays.hashCode(bArr);
    }

    public static byte[] n(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof c0)) {
            try {
                c0 c0Var = (c0) obj;
                if (((n) c0Var).f12295a == this.f12295a) {
                    return Arrays.equals(u(), (byte[]) xd.b.u(new xd.b(((n) c0Var).u())));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12295a;
    }

    public abstract byte[] u();

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            xd.b bVar = new xd.b(u());
            parcel2.writeNoException();
            zzc.zze(parcel2, bVar);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f12295a);
        return true;
    }
}
