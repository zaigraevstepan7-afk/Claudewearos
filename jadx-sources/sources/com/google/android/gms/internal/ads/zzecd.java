package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.anonlab.voidlauncher.R;
import h4.l;
import h4.p;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import mc.n;
import nc.t;
import pc.i;
import qc.l0;
import qc.r0;
import rc.k;
import rc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzecd extends zzbtg {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsc zzc;
    private final o zzd;
    private final zzebs zze;
    private String zzf;
    private String zzg;

    public zzecd(Context context, zzebs zzebsVar, o oVar, zzdsc zzdscVar) {
        this.zzb = context;
        this.zzc = zzdscVar;
        this.zzd = oVar;
        this.zze = zzebsVar;
    }

    public static /* synthetic */ void zzc(zzecd zzecdVar, i iVar, DialogInterface dialogInterface, int i10) {
        zzecdVar.zze.zzc(zzecdVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzecdVar.zzw(zzecdVar.zzf, "rtsdc", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public static /* synthetic */ void zzd(zzecd zzecdVar, i iVar, DialogInterface dialogInterface) {
        zzecdVar.zze.zzc(zzecdVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzecdVar.zzw(zzecdVar.zzf, "rtsdc", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public static void zzk(zzecd zzecdVar, Activity activity, i iVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzecdVar.zzw(zzecdVar.zzf, "rtsdc", map);
        n.D.f11580f.getClass();
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        activity.startActivity(intent);
        zzecdVar.zzx();
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public static /* synthetic */ void zzl(zzecd zzecdVar, i iVar, DialogInterface dialogInterface, int i10) {
        zzecdVar.zze.zzc(zzecdVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzecdVar.zzw(zzecdVar.zzf, "dialog_click", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public static /* synthetic */ void zzm(zzecd zzecdVar, Activity activity, i iVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzecdVar.zzw(zzecdVar.zzf, "dialog_click", map);
        zzecdVar.zzy(activity, iVar);
    }

    public static /* synthetic */ void zzn(zzecd zzecdVar, i iVar, DialogInterface dialogInterface) {
        zzecdVar.zze.zzc(zzecdVar.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzecdVar.zzw(zzecdVar.zzf, "dialog_click", map);
        if (iVar != null) {
            iVar.zzb();
        }
    }

    public static void zzo(Context context, zzdsc zzdscVar, zzebs zzebsVar, String str, String str2) {
        zzp(context, zzdscVar, zzebsVar, str, str2, new HashMap());
    }

    public static void zzp(Context context, zzdsc zzdscVar, zzebs zzebsVar, String str, String str2, Map map) {
        String strZze;
        n nVar = n.D;
        String str3 = true != nVar.f11582h.zzA(context) ? "offline" : p.a.ONLINE_EXTRAS_KEY;
        if (zzdscVar != null) {
            zzdsb zzdsbVarZza = zzdscVar.zza();
            zzdsbVarZza.zzb("gqi", str);
            zzdsbVarZza.zzb("action", str2);
            zzdsbVarZza.zzb("device_connectivity", str3);
            nVar.f11584k.getClass();
            zzdsbVarZza.zzb("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdsbVarZza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            strZze = zzdsbVarZza.zze();
        } else {
            strZze = "";
        }
        String str4 = strZze;
        n.D.f11584k.getClass();
        zzebsVar.zzd(new zzebu(System.currentTimeMillis(), str, str4, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return zzfsb.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return zzfsb.zza(context, 0, intent, 201326592);
    }

    private final AlertDialog zzs(Activity activity, final i iVar) {
        r0 r0Var = n.D.f11577c;
        AlertDialog.Builder onCancelListener = r0.j(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzebv
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzt = zzt(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzt, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzu = zzu();
            if (!TextUtils.isEmpty(strZzu)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzu);
            }
            zzebk zzebkVar = (zzebk) this.zza.get(this.zzf);
            Drawable drawableZza = zzebkVar != null ? zzebkVar.zza() : null;
            if (drawableZza != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZza);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser zzt(int i10) {
        Resources resourcesZze = n.D.f11582h.zze();
        if (resourcesZze == null) {
            return null;
        }
        try {
            return resourcesZze.getLayout(i10);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzu() {
        zzebk zzebkVar = (zzebk) this.zza.get(this.zzf);
        return zzebkVar == null ? "" : zzebkVar.zzb();
    }

    private static String zzv(int i10, String str) {
        Resources resourcesZze = n.D.f11582h.zze();
        if (resourcesZze == null) {
            return str;
        }
        try {
            return resourcesZze.getString(i10);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzp(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzx() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            mc.n r0 = mc.n.D     // Catch: android.os.RemoteException -> L22
            qc.r0 r0 = r0.f11577c     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r7.zzb     // Catch: android.os.RemoteException -> L22
            qc.a0 r1 = qc.r0.a(r0)     // Catch: android.os.RemoteException -> L22
            xd.b r2 = new xd.b     // Catch: android.os.RemoteException -> L22
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L22
            oc.a r3 = new oc.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r7.zzg     // Catch: android.os.RemoteException -> L22
            java.lang.String r5 = r7.zzf     // Catch: android.os.RemoteException -> L22
            java.util.Map r6 = r7.zza     // Catch: android.os.RemoteException -> L22
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.zzebk r6 = (com.google.android.gms.internal.ads.zzebk) r6     // Catch: android.os.RemoteException -> L22
            if (r6 != 0) goto L24
            java.lang.String r6 = ""
            goto L28
        L22:
            r0 = move-exception
            goto L43
        L24:
            java.lang.String r6 = r6.zzc()     // Catch: android.os.RemoteException -> L22
        L28:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L22
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L22
            if (r2 != 0) goto L41
            xd.b r3 = new xd.b     // Catch: android.os.RemoteException -> L3f
            r3.<init>(r0)     // Catch: android.os.RemoteException -> L3f
            java.lang.String r0 = r7.zzg     // Catch: android.os.RemoteException -> L3f
            java.lang.String r4 = r7.zzf     // Catch: android.os.RemoteException -> L3f
            boolean r0 = r1.zzf(r3, r0, r4)     // Catch: android.os.RemoteException -> L3f
            goto L4c
        L3f:
            r0 = move-exception
            goto L44
        L41:
            r0 = 1
            goto L4c
        L43:
            r2 = 0
        L44:
            int r1 = qc.l0.f13401b
            java.lang.String r1 = "Failed to schedule offline notification poster."
            rc.k.e(r1, r0)
            r0 = r2
        L4c:
            if (r0 != 0) goto L60
            com.google.android.gms.internal.ads.zzebs r0 = r7.zze
            java.lang.String r1 = r7.zzf
            r0.zzc(r1)
            java.lang.String r0 = r7.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzfyi r2 = com.google.android.gms.internal.ads.zzfyi.zzd()
            r7.zzw(r0, r1, r2)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecd.zzx():void");
    }

    private final void zzy(final Activity activity, final i iVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        if (new p(activity).f7652a.areNotificationsEnabled()) {
            zzx();
            zzz(activity, iVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzfyi.zzd());
                return;
            }
            r0 r0Var2 = nVar.f11577c;
            AlertDialog.Builder builderJ = r0.j(activity);
            builderJ.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    zzecd.zzk(this.zza, activity, iVar, dialogInterface, i10);
                }
            }).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebx
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzecd.zzc(this.zza, iVar, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeby
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzecd.zzd(this.zza, iVar, dialogInterface);
                }
            });
            builderJ.create().show();
            zzw(this.zzf, "rtsdi", zzfyi.zzd());
        }
    }

    private final void zzz(Activity activity, i iVar) {
        AlertDialog alertDialogZzs = zzs(activity, iVar);
        alertDialogZzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzecc(this, alertDialogZzs, timer, iVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzA = n.D.f11582h.zzA(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zZzA ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c == 1) {
                        this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzebs.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e10) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e10.toString());
                    int i10 = l0.f13401b;
                    k.d(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzf(String[] strArr, int[] iArr, xd.a aVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzecf zzecfVar = (zzecf) xd.b.u(aVar);
                Activity activityZza = zzecfVar.zza();
                i iVarZzb = zzecfVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i10] == 0) {
                    map.put("dialog_action", "confirm");
                    zzx();
                    zzz(activityZza, iVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (iVarZzb != null) {
                        iVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzg(xd.a aVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzecf zzecfVar = (zzecf) xd.b.u(aVar);
        final Activity activityZza = zzecfVar.zza();
        final i iVarZzb = zzecfVar.zzb();
        this.zzf = zzecfVar.zzc();
        this.zzg = zzecfVar.zzd();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zziI)).booleanValue()) {
            zzy(activityZza, iVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzfyi.zzd());
        r0 r0Var = n.D.f11577c;
        AlertDialog.Builder builderJ = r0.j(activityZza);
        builderJ.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                zzecd.zzm(this.zza, activityZza, iVarZzb, dialogInterface, i10);
            }
        }).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeca
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                zzecd.zzl(this.zza, iVarZzb, dialogInterface, i10);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzecd.zzn(this.zza, iVarZzb, dialogInterface);
            }
        });
        builderJ.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzh() {
        final o oVar = this.zzd;
        this.zze.zze(new zzffw() { // from class: com.google.android.gms.internal.ads.zzebl
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) throws Throwable {
                zzebs.zzb(oVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzi(xd.a aVar, String str, String str2) {
        zzj(aVar, new oc.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final void zzj(xd.a aVar, oc.a aVar2) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) xd.b.u(aVar);
        String str2 = aVar2.f12444a;
        String str3 = aVar2.f12445b;
        String str4 = aVar2.f12446c;
        String strZzu = zzu();
        n.D.f11580f.getClass();
        zzbct zzbctVar = zzbdc.zziK;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((Integer) zzbdaVar.zzb(zzbctVar)).intValue());
        notificationChannel.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        l lVar = new l(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strZzu)) {
            lVar.f7637e = l.b(zzv(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            lVar.f7637e = l.b(String.format(zzv(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzu));
        }
        lVar.c(true);
        lVar.f7650s.deleteIntent = pendingIntentZzr2;
        lVar.f7639g = pendingIntentZzr;
        lVar.f7650s.icon = context.getApplicationInfo().icon;
        lVar.j = ((Integer) zzbdaVar2.zzb(zzbdc.zziJ)).intValue();
        if (!((Boolean) zzbdaVar2.zzb(zzbdc.zziL)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.f871b = bitmapDecodeStream;
                lVar.f7640h = iconCompat;
                h4.i iVar = new h4.i();
                IconCompat iconCompat2 = new IconCompat(1);
                iconCompat2.f871b = bitmapDecodeStream;
                iVar.f7629b = iconCompat2;
                iVar.f7630c = null;
                iVar.f7631d = true;
                lVar.d(iVar);
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, lVar.a());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            map.put("notification_not_shown_reason", e10.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    public final void zzq(String str, zzdim zzdimVar) {
        String strZzx = zzdimVar.zzx();
        String strZzB = zzdimVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzx)) {
            strZzx = strZzB != null ? strZzB : "";
        }
        zzbgn zzbgnVarZzm = zzdimVar.zzm();
        if (zzbgnVarZzm != null) {
            try {
                string = zzbgnVarZzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbgn zzbgnVarZzn = zzdimVar.zzn();
        Drawable drawable = null;
        if (zzbgnVarZzn != null) {
            try {
                xd.a aVarZzf = zzbgnVarZzn.zzf();
                if (aVarZzf != null) {
                    drawable = (Drawable) xd.b.u(aVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzebg(strZzx, string, drawable));
    }
}
