package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f3715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3716c;

    public /* synthetic */ x(Intent intent, Object obj, int i10) {
        this.f3714a = i10;
        this.f3715b = intent;
        this.f3716c = obj;
    }

    public final void a() {
        switch (this.f3714a) {
            case 0:
                Intent intent = this.f3715b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f3716c).startActivityForResult(intent, 2);
                    break;
                }
                break;
            default:
                Intent intent2 = this.f3715b;
                if (intent2 != null) {
                    ((com.google.android.gms.common.api.internal.l) this.f3716c).startActivityForResult(intent2, 2);
                    break;
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
