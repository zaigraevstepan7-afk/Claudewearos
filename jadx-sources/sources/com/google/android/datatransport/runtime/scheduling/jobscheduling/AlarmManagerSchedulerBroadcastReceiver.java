package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import ac.g;
import ac.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import ec.a;
import java.util.concurrent.Executor;
import p1.l;
import ub.i;
import ub.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3435a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        l lVarA = i.a();
        lVarA.D(queryParameter);
        lVarA.f12662d = a.b(iIntValue);
        if (queryParameter2 != null) {
            lVarA.f12661c = Base64.decode(queryParameter2, 0);
        }
        n nVar = p.a().f16981d;
        ((Executor) nVar.f410e).execute(new g(nVar, lVarA.f(), i10, new ac.a(0)));
    }
}
