package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbso implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsp zza;

    public zzbso(zzbsp zzbspVar) {
        this.zza = zzbspVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        this.zza.zzh("User canceled the download.");
    }
}
