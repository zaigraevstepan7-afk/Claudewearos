package com.anonlab.voidlauncher;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.anonlab.voidlauncher.feature.home.presentation.DevlogActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import fj.l;
import h4.j;
import ld.i;
import q.e;
import wh.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class VoidFirebaseMessagingService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(r rVar) {
        String str;
        String str2;
        Object systemService = getSystemService("notification");
        l.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationChannel notificationChannel = new NotificationChannel("void_devlog", "Dev Logs", 3);
        notificationChannel.setDescription("\u00c9rtes\u00edt\u00e9s \u00faj fejleszt\u0151i bejegyz\u00e9sn\u00e9l");
        notificationManager.createNotificationChannel(notificationChannel);
        NotificationChannel notificationChannel2 = new NotificationChannel("void_apk_update", "APK friss\u00edt\u00e9sek", 4);
        notificationChannel2.setDescription("\u00c9rtes\u00edt\u00e9s \u00faj VoidLauncher verzi\u00f3 megjelen\u00e9sekor");
        notificationManager.createNotificationChannel(notificationChannel2);
        Bundle bundle = rVar.f19375a;
        if (rVar.f19377c == null && i.O(bundle)) {
            rVar.f19377c = new wh.i(new i(bundle));
        }
        wh.i iVar = rVar.f19377c;
        if ((iVar == null || (str = (String) iVar.f19358a) == null) && (str = (String) ((e) rVar.b()).get("title")) == null) {
            return;
        }
        if (rVar.f19377c == null && i.O(bundle)) {
            rVar.f19377c = new wh.i(new i(bundle));
        }
        wh.i iVar2 = rVar.f19377c;
        if ((iVar2 == null || (str2 = (String) iVar2.f19359b) == null) && (str2 = (String) ((e) rVar.b()).get("body")) == null) {
            return;
        }
        String string = bundle.getString("from");
        if (string == null) {
            string = "";
        }
        String str3 = nj.e.C0(string, "apk_update", false) ? "void_apk_update" : "void_devlog";
        int i10 = nj.e.C0(string, "apk_update", false) ? 2 : 1;
        Intent intent = new Intent(this, (Class<?>) DevlogActivity.class);
        intent.addFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this, i10, intent, 201326592);
        h4.l lVar = new h4.l(this, str3);
        lVar.f7650s.icon = R.mipmap.ic_launcher;
        lVar.f7637e = h4.l.b(str);
        lVar.f7638f = h4.l.b(str2);
        j jVar = new j();
        jVar.f7632b = h4.l.b(str2);
        lVar.d(jVar);
        lVar.c(true);
        lVar.j = str3.equals("void_apk_update") ? 1 : 0;
        lVar.f7639g = activity;
        Notification notificationA = lVar.a();
        l.e(notificationA, "build(...)");
        Object systemService2 = getSystemService("notification");
        l.d(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService2).notify(i10, notificationA);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String str) {
        l.f(str, "token");
    }
}
