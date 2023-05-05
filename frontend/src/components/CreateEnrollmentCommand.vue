<template>

    <v-card outlined>
        <v-card-title>
            CreateEnrollment
        </v-card-title>

        <v-card-text>
            <String label="StudentId" v-model="value.studentId" :editMode="editMode"/>
            <String label="ClassCode" v-model="value.classCode" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="createEnrollment"
            >
                CreateEnrollment
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateEnrollmentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.studentId = '';
            this.value.classCode = '';
        },
        watch: {
        },
        methods: {
            createEnrollment() {
                this.$emit('createEnrollment', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

