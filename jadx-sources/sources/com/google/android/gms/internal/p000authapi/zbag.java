package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import hd.h;
import hd.k;
import hd.r;
import java.util.ArrayList;
import java.util.List;
import nd.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zbag extends m implements h {
    private static final com.google.android.gms.common.api.h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        com.google.android.gms.common.api.h hVar = new com.google.android.gms.common.api.h();
        zba = hVar;
        zbad zbadVar = new zbad();
        zbb = zbadVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbadVar, hVar);
    }

    public zbag(Activity activity, r rVar) {
        super(activity, activity, zbc, rVar, l.f3608c);
        this.zbd = zbat.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f3490z;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : wd.a.v(byteArrayExtra, creator));
        return status2 == null ? status : status2;
    }

    public final Task<k> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        e0.i(saveAccountLinkingTokenRequest);
        new ArrayList();
        List list = saveAccountLinkingTokenRequest.f3462d;
        String str = saveAccountLinkingTokenRequest.f3461c;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f3459a;
        String str2 = saveAccountLinkingTokenRequest.f3460b;
        int i10 = saveAccountLinkingTokenRequest.f3464f;
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f3463e);
        String str3 = this.zbd;
        e0.a("Consent PendingIntent cannot be null", pendingIntent != null);
        e0.a("Invalid tokenType", "auth_code".equals(str2));
        e0.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str));
        e0.a("scopes cannot be null", list != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str, list, str3, i10);
        x xVarA = y.a();
        xVarA.f3599e = new d[]{zbas.zbg};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api.zbab
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                zbae zbaeVar = new zbae(this.zba, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                e0.i(saveAccountLinkingTokenRequest3);
                zbnVar.zbc(zbaeVar, saveAccountLinkingTokenRequest3);
            }
        };
        xVarA.f3597c = false;
        xVarA.f3596b = 1535;
        return doRead(xVarA.a());
    }

    @Override // hd.h
    public final Task<hd.m> savePassword(hd.l lVar) {
        e0.i(lVar);
        final hd.l lVar2 = new hd.l(lVar.f7873a, this.zbd, lVar.f7875c);
        x xVarA = y.a();
        xVarA.f3599e = new d[]{zbas.zbe};
        xVarA.f3598d = new t() { // from class: com.google.android.gms.internal.auth-api.zbac
            @Override // com.google.android.gms.common.api.internal.t
            public final void accept(Object obj, Object obj2) {
                zbaf zbafVar = new zbaf(this.zba, (TaskCompletionSource) obj2);
                zbn zbnVar = (zbn) ((zbh) obj).getService();
                hd.l lVar3 = lVar2;
                e0.i(lVar3);
                zbnVar.zbd(zbafVar, lVar3);
            }
        };
        xVarA.f3597c = false;
        xVarA.f3596b = 1536;
        return doRead(xVarA.a());
    }

    public zbag(Context context, r rVar) {
        super(context, null, zbc, rVar, l.f3608c);
        this.zbd = zbat.zba();
    }
}
