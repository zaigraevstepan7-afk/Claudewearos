package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import mc.n;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbvm extends od.a {
    public static final Parcelable.Creator<zzbvm> CREATOR = new zzbvn();
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    public zzbvm(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) throws IOException {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe;
        if (this.zza == null) {
            Parcel parcelObtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(parcelObtain, 0);
                final byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
                } catch (IOException e10) {
                    e = e10;
                    autoCloseOutputStream = null;
                }
                try {
                    zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbvl
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            DataOutputStream dataOutputStream;
                            Parcelable.Creator<zzbvm> creator = zzbvm.CREATOR;
                            OutputStream outputStream = autoCloseOutputStream;
                            byte[] bArr = bArrMarshall;
                            DataOutputStream dataOutputStream2 = null;
                            try {
                                try {
                                    dataOutputStream = new DataOutputStream(outputStream);
                                } catch (IOException e11) {
                                    e = e11;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                                ud.c.d(dataOutputStream);
                            } catch (IOException e12) {
                                e = e12;
                                dataOutputStream2 = dataOutputStream;
                                int i11 = l0.f13401b;
                                k.e("Error transporting the ad response", e);
                                n.D.f11582h.zzw(e, "LargeParcelTeleporter.pipeData.1");
                                if (dataOutputStream2 == null) {
                                    ud.c.d(outputStream);
                                } else {
                                    ud.c.d(dataOutputStream2);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dataOutputStream2 = dataOutputStream;
                                if (dataOutputStream2 == null) {
                                    ud.c.d(outputStream);
                                } else {
                                    ud.c.d(dataOutputStream2);
                                }
                                throw th;
                            }
                        }
                    });
                    parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                } catch (IOException e11) {
                    e = e11;
                    int i11 = l0.f13401b;
                    k.e("Error transporting the ad response", e);
                    n.D.f11582h.zzw(e, "LargeParcelTeleporter.pipeData.2");
                    ud.c.d(autoCloseOutputStream);
                    this.zza = parcelFileDescriptor;
                    int iH0 = uk.c.h0(20293, parcel);
                    uk.c.b0(parcel, 2, this.zza, i10, false);
                    uk.c.j0(iH0, parcel);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        int iH02 = uk.c.h0(20293, parcel);
        uk.c.b0(parcel, 2, this.zza, i10, false);
        uk.c.j0(iH02, parcel);
    }

    public final od.b zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                int i10 = l0.f13401b;
                k.d("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int i11 = dataInputStream.readInt();
                    byte[] bArr = new byte[i11];
                    dataInputStream.readFully(bArr, 0, i11);
                    ud.c.d(dataInputStream);
                    Parcel parcelObtain = Parcel.obtain();
                    try {
                        parcelObtain.unmarshall(bArr, 0, i11);
                        parcelObtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(parcelObtain);
                        parcelObtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (IOException e10) {
                    int i12 = l0.f13401b;
                    k.e("Could not read from parcel file descriptor", e10);
                    ud.c.d(dataInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                ud.c.d(dataInputStream);
                throw th3;
            }
        }
        return (od.b) this.zzb;
    }
}
