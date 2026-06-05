package z4;

import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import y.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f20375a;

    public g(n nVar, h hVar) {
        this.f20375a = nVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r4) throws d5.a {
        /*
            r3 = this;
            android.credentials.GetCredentialException r4 = z4.f.e(r4)
            java.lang.String r0 = "error"
            fj.l.f(r4, r0)
            java.lang.String r0 = "CredManProvService"
            java.lang.String r1 = "GetCredentialResponse error returned from framework"
            android.util.Log.i(r0, r1)
            java.lang.String r0 = t0.h.r(r4)
            int r1 = r0.hashCode()
            switch(r1) {
                case -781118336: goto L59;
                case -45448328: goto L45;
                case 580557411: goto L30;
                case 627896683: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L61
        L1c:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L25
            goto L61
        L25:
            a5.f r0 = new a5.f
            java.lang.String r4 = t0.h.z(r4)
            r0.<init>(r4)
            goto Lb5
        L30:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_USER_CANCELED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L61
        L39:
            a5.b r0 = new a5.b
            java.lang.String r4 = t0.h.z(r4)
            r1 = 0
            r0.<init>(r4, r1)
            goto Lb5
        L45:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_INTERRUPTED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L61
        L4e:
            a5.b r0 = new a5.b
            java.lang.String r4 = t0.h.z(r4)
            r1 = 1
            r0.<init>(r4, r1)
            goto Lb5
        L59:
            java.lang.String r1 = "android.credentials.GetCredentialException.TYPE_UNKNOWN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lab
        L61:
            java.lang.String r0 = t0.h.r(r4)
            java.lang.String r1 = "error.type"
            fj.l.e(r0, r1)
            java.lang.String r2 = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION"
            boolean r0 = nj.l.A0(r0, r2)
            if (r0 == 0) goto L9a
            int r0 = a5.c.f180e
            java.lang.String r0 = t0.h.r(r4)
            fj.l.e(r0, r1)
            java.lang.String r4 = t0.h.z(r4)
            boolean r1 = nj.l.A0(r0, r2)     // Catch: d5.a -> L93
            if (r1 == 0) goto L8d
            int r1 = a5.c.f180e     // Catch: d5.a -> L93
            a5.d r4 = mk.b.o(r0, r4)     // Catch: d5.a -> L93
            r0 = r4
            goto Lb5
        L8d:
            d5.a r1 = new d5.a     // Catch: d5.a -> L93
            r1.<init>()     // Catch: d5.a -> L93
            throw r1     // Catch: d5.a -> L93
        L93:
            a5.c r1 = new a5.c
            r1.<init>(r0, r4)
            r0 = r1
            goto Lb5
        L9a:
            a5.c r0 = new a5.c
            java.lang.String r2 = t0.h.r(r4)
            fj.l.e(r2, r1)
            java.lang.String r4 = t0.h.z(r4)
            r0.<init>(r2, r4)
            goto Lb5
        Lab:
            a5.b r0 = new a5.b
            java.lang.String r4 = t0.h.z(r4)
            r1 = 3
            r0.<init>(r4, r1)
        Lb5:
            y.n r4 = r3.f20375a
            r4.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.g.onError(java.lang.Throwable):void");
    }

    public final void onResult(Object obj) throws d5.a {
        c iVar;
        GetCredentialResponse getCredentialResponseF = f.f(obj);
        fj.l.f(getCredentialResponseF, "response");
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential credential = getCredentialResponseF.getCredential();
        fj.l.e(credential, "response.credential");
        String type = credential.getType();
        fj.l.e(type, "credential.type");
        Bundle data = credential.getData();
        fj.l.e(data, "credential.data");
        try {
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                    fj.l.c(string);
                    fj.l.c(string2);
                    iVar = new l(string2, data, 0);
                } catch (Exception unused) {
                    throw new d5.a();
                }
            } else {
                if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new d5.a();
                }
                try {
                    String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                    fj.l.c(string3);
                    iVar = new l(string3, data, 1);
                } catch (Exception unused2) {
                    throw new d5.a();
                }
            }
        } catch (d5.a unused3) {
            iVar = new i(type, data);
        }
        this.f20375a.c(new k(iVar));
    }
}
