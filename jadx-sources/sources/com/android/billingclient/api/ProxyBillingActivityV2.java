package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import c.m;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import fj.l;
import g.f;
import g.h;
import h.b;
import w2.s1;
import yh.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends m {
    public f M;
    public f N;
    public ResultReceiver O;
    public ResultReceiver P;

    @Override // c.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.M = m(new b(6), new c(this, 24));
        this.N = m(new b(6), new s1(this, 2));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.O = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.P = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.O = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            f fVar = this.M;
            l.f(pendingIntent, com.google.android.gms.common.internal.f.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            l.e(intentSender, "getIntentSender(...)");
            fVar.a0(new h(intentSender, null, 0, 0));
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.P = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            f fVar2 = this.N;
            l.f(pendingIntent2, com.google.android.gms.common.internal.f.KEY_PENDING_INTENT);
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            l.e(intentSender2, "getIntentSender(...)");
            fVar2.a0(new h(intentSender2, null, 0, 0));
        }
    }

    @Override // c.m, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.O;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.P;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
