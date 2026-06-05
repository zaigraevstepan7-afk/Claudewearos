package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpo;
import nc.i1;
import nc.y2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class LiteSdkInfo extends i1 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // nc.j1
    public zzbpo getAdapterCreator() {
        return new zzbpk();
    }

    @Override // nc.j1
    public y2 getLiteSdkVersion() {
        return new y2(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.4.0");
    }
}
