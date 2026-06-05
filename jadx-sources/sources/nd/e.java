package nd;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import w5.i0;
import w5.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12277c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final e f12278d = new e();

    public static AlertDialog f(Activity activity, int i10, x xVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(w.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i10 != 1 ? i10 != 2 ? i10 != 3 ? resources.getString(R.string.ok) : resources.getString(com.anonlab.voidlauncher.R.string.common_google_play_services_enable_button) : resources.getString(com.anonlab.voidlauncher.R.string.common_google_play_services_update_button) : resources.getString(com.anonlab.voidlauncher.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, xVar);
        }
        String strC = w.c(activity, i10);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", m6.a.d(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof w5.w) {
                i0 i0Var = ((v) ((w5.w) activity).M.f449b).f18779z;
                k kVar = new k();
                e0.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                kVar.C0 = alertDialog;
                if (onCancelListener != null) {
                    kVar.D0 = onCancelListener;
                }
                kVar.z0 = false;
                kVar.A0 = true;
                i0Var.getClass();
                w5.a aVar = new w5.a(i0Var);
                aVar.f18599o = true;
                aVar.f(0, kVar, str, 1);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        e0.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f12271a = alertDialog;
        if (onCancelListener != null) {
            cVar.f12272b = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @Override // nd.f
    public final int c(Context context) {
        return d(context, f.f12279a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogF = f(googleApiActivity, i10, new x(super.b(googleApiActivity, "d", i10), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogF == null) {
            return;
        }
        g(googleApiActivity, alertDialogF, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", m6.a.e(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new l(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? w.e(context, "common_google_play_services_resolution_required_title") : w.c(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(com.anonlab.voidlauncher.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i10 == 6 || i10 == 19) ? w.d(context, "common_google_play_services_resolution_required_text", w.a(context)) : w.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        e0.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        h4.l lVar = new h4.l(context, null);
        lVar.f7644m = true;
        lVar.c(true);
        lVar.f7637e = h4.l.b(strE);
        h4.j jVar = new h4.j();
        jVar.f7632b = h4.l.b(strD);
        lVar.d(jVar);
        PackageManager packageManager = context.getPackageManager();
        if (ud.c.f16985c == null) {
            ud.c.f16985c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (ud.c.f16985c.booleanValue()) {
            lVar.f7650s.icon = context.getApplicationInfo().icon;
            lVar.j = 2;
            if (ud.c.m(context)) {
                lVar.f7634b.add(new h4.f(resources.getString(com.anonlab.voidlauncher.R.string.common_open_on_phone), pendingIntent));
            } else {
                lVar.f7639g = pendingIntent;
            }
        } else {
            lVar.f7650s.icon = R.drawable.stat_sys_warning;
            lVar.f7650s.tickerText = h4.l.b(resources.getString(com.anonlab.voidlauncher.R.string.common_google_play_services_notification_ticker));
            lVar.f7650s.when = System.currentTimeMillis();
            lVar.f7639g = pendingIntent;
            lVar.f7638f = h4.l.b(strD);
        }
        synchronized (f12277c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.anonlab.voidlauncher.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        lVar.f7648q = "com.google.android.gms.availability";
        Notification notificationA = lVar.a();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            i.f12283a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationA);
    }

    public final void i(Activity activity, com.google.android.gms.common.api.internal.l lVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogF = f(activity, i10, new x(super.b(activity, "d", i10), lVar, 1), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        g(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
