package g5;

import a2.d0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import c2.x0;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.internal.p000authapi.zbaq;
import e5.e;
import fj.l;
import fj.v;
import hd.o;
import hd.s;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f5.a f7206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(f5.a aVar, Handler handler, int i10) {
        super(handler);
        this.f7205a = i10;
        this.f7206b = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        boolean z2;
        boolean z10;
        int i11 = this.f7205a;
        int i12 = 7;
        f5.a aVar = this.f7206b;
        l.f(bundle, "resultData");
        switch (i11) {
            case 0:
                d dVar = (d) aVar;
                int i13 = f5.a.f6643c;
                Executor executorF = dVar.f();
                z4.d dVarE = dVar.e();
                CancellationSignal cancellationSignal = dVar.f7211g;
                if (bundle.getBoolean("FAILURE_RESPONSE")) {
                    f5.a.a(cancellationSignal, new e(executorF, dVarE, h9.a.i(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"))));
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    int i14 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                    int i15 = f5.a.f6642b;
                    if (i14 != i15) {
                        Log.w("BeginSignIn", "Returned request code " + i15 + " which  does not match what was given " + i14);
                        break;
                    } else {
                        int i16 = 5;
                        if (!f5.a.c(i10, a.f7201a, new x0(dVar, i16), dVar.f7211g)) {
                            try {
                                Context context = dVar.f7208d;
                                e0.i(context);
                                o signInCredentialFromIntent = new zbaq(context, new s()).getSignInCredentialFromIntent(intent);
                                l.e(signInCredentialFromIntent, "getSignInClient(context)\u2026redentialFromIntent(data)");
                                f5.a.a(dVar.f7211g, new d0(4, dVar, dVar.d(signInCredentialFromIntent)));
                                break;
                            } catch (a5.d e10) {
                                f5.a.a(dVar.f7211g, new d0(6, dVar, e10));
                                return;
                            } catch (j e11) {
                                v vVar = new v();
                                vVar.f6807a = new a5.b(e11.getMessage(), 3);
                                if (e11.getStatusCode() == 16) {
                                    vVar.f6807a = new a5.b(e11.getMessage(), 0);
                                } else if (f5.a.f6641a.contains(Integer.valueOf(e11.getStatusCode()))) {
                                    vVar.f6807a = new a5.b(e11.getMessage(), 1);
                                }
                                f5.a.a(dVar.f7211g, new d0(dVar, vVar, i16));
                                return;
                            } catch (Throwable th2) {
                                f5.a.a(dVar.f7211g, new d0(i12, dVar, new a5.b(th2.getMessage(), 3)));
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                i5.c cVar = (i5.c) aVar;
                int i17 = f5.a.f6643c;
                Executor executorG = cVar.g();
                z4.d dVarF = cVar.f();
                CancellationSignal cancellationSignal2 = cVar.f8352g;
                if (bundle.getBoolean("FAILURE_RESPONSE")) {
                    f5.a.a(cancellationSignal2, new e(executorG, dVarF, h9.a.i(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"))));
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int i18 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                    Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                    int i19 = f5.a.f6642b;
                    if (i18 != i19) {
                        Log.w("GetSignInIntent", "Returned request code " + i19 + " which  does not match what was given " + i18);
                        break;
                    } else {
                        if (!f5.a.c(i10, i5.a.f8344a, new x0(cVar, i12), cVar.f8352g)) {
                            try {
                                Context context2 = cVar.f8349d;
                                e0.i(context2);
                                o signInCredentialFromIntent2 = new zbaq(context2, new s()).getSignInCredentialFromIntent(intent2);
                                l.e(signInCredentialFromIntent2, "getSignInClient(context)\u2026redentialFromIntent(data)");
                                f5.a.a(cVar.f8352g, new d0(8, cVar, cVar.e(signInCredentialFromIntent2)));
                                break;
                            } catch (a5.d e12) {
                                f5.a.a(cVar.f8352g, new d0(10, cVar, e12));
                                return;
                            } catch (j e13) {
                                v vVar2 = new v();
                                vVar2.f6807a = new a5.b(e13.getMessage(), 3);
                                if (e13.getStatusCode() == 16) {
                                    vVar2.f6807a = new a5.b(e13.getMessage(), 0);
                                } else if (f5.a.f6641a.contains(Integer.valueOf(e13.getStatusCode()))) {
                                    vVar2.f6807a = new a5.b(e13.getMessage(), 1);
                                }
                                f5.a.a(cVar.f8352g, new d0(cVar, vVar2, 9));
                            } catch (Throwable th3) {
                                f5.a.a(cVar.f8352g, new d0(11, cVar, new a5.b(th3.getMessage(), 3)));
                                return;
                            }
                        }
                    }
                }
                break;
        }
    }
}
