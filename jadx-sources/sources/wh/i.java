package wh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19356c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static d0 f19357d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f19358a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19359b;

    public i(ExecutorService executorService) {
        this.f19359b = new q.e(0);
        this.f19358a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z2) {
        d0 d0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f19356c) {
            try {
                if (f19357d == null) {
                    f19357d = new d0(context);
                }
                d0Var = f19357d;
            } finally {
            }
        }
        if (!z2) {
            return d0Var.b(intent).continueWith(new n.a(1), new vf.j(4));
        }
        if (s.i().l(context)) {
            synchronized (a0.f19330b) {
                try {
                    a0.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        a0.f19331c.a(a0.f19329a);
                    }
                    d0Var.b(intent).addOnCompleteListener(new t1.f(intent, 5));
                } finally {
                }
            }
        } else {
            d0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f19358a;
        n.a aVar = (n.a) this.f19359b;
        boolean z2 = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z10 = (intent.getFlags() & 268435456) != 0;
        return (!z2 || z10) ? Tasks.call(aVar, new ai.d(2, context, intent)).continueWithTask(aVar, new Continuation() { // from class: wh.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return ((Integer) task.getResult()).intValue() != 402 ? task : i.a(context, intent, z10).continueWith(new n.a(1), new vf.j(3));
            }
        }) : a(context, intent, z10);
    }

    public i(Context context) {
        this.f19358a = context;
        this.f19359b = new n.a(1);
    }

    public i(ld.i iVar) throws JSONException {
        this.f19358a = iVar.L("gcm.n.title");
        iVar.I("gcm.n.title");
        Object[] objArrH = iVar.H("gcm.n.title");
        if (objArrH != null) {
            String[] strArr = new String[objArrH.length];
            for (int i10 = 0; i10 < objArrH.length; i10++) {
                strArr[i10] = String.valueOf(objArrH[i10]);
            }
        }
        this.f19359b = iVar.L("gcm.n.body");
        iVar.I("gcm.n.body");
        Object[] objArrH2 = iVar.H("gcm.n.body");
        if (objArrH2 != null) {
            String[] strArr2 = new String[objArrH2.length];
            for (int i11 = 0; i11 < objArrH2.length; i11++) {
                strArr2[i11] = String.valueOf(objArrH2[i11]);
            }
        }
        iVar.L("gcm.n.icon");
        if (TextUtils.isEmpty(iVar.L("gcm.n.sound2"))) {
            iVar.L("gcm.n.sound");
        }
        iVar.L("gcm.n.tag");
        iVar.L("gcm.n.color");
        iVar.L("gcm.n.click_action");
        iVar.L("gcm.n.android_channel_id");
        String strL = iVar.L("gcm.n.link_android");
        strL = TextUtils.isEmpty(strL) ? iVar.L("gcm.n.link") : strL;
        if (!TextUtils.isEmpty(strL)) {
            Uri.parse(strL);
        }
        iVar.L("gcm.n.image");
        iVar.L("gcm.n.ticker");
        iVar.E("gcm.n.notification_priority");
        iVar.E("gcm.n.visibility");
        iVar.E("gcm.n.notification_count");
        iVar.C("gcm.n.sticky");
        iVar.C("gcm.n.local_only");
        iVar.C("gcm.n.default_sound");
        iVar.C("gcm.n.default_vibrate_timings");
        iVar.C("gcm.n.default_light_settings");
        iVar.J();
        iVar.G();
        iVar.M();
    }
}
